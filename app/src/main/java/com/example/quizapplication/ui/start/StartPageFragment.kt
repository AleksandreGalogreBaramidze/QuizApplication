package com.example.quizapplication.ui.start


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapplication.R
import com.example.quizapplication.databinding.StartPageFragmentBinding
import com.example.quizapplication.extensions.startAnimation
import com.example.quizapplication.ui.basefragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartPageFragment : BaseFragment<StartPageFragmentBinding, StartPageViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> StartPageFragmentBinding get() = StartPageFragmentBinding::inflate
    override fun getViewModel() = StartPageViewModel::class.java
    override fun initFragment(viewModel: StartPageViewModel) {
        startAnimation()
        binding.nextPageButton.setOnClickListener {
            with(binding) {
                viewModel.validateUserName(userNameEditText.text.toString(), {
                    findNavController().navigate(R.id.action_startPageFragment_to_homeFragment)
                }, {
                    userNameEditText.error = getString(R.string.passwordErrorMessage)
                })
            }
        }

    }

    private fun startAnimation() {
        binding.root.startAnimation(R.anim.fade_in)
    }
}