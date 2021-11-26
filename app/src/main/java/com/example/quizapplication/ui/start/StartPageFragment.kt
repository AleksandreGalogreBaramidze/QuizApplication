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
        setListeners(viewModel)

    }
    private fun startAnimation(){
        binding.root.startAnimation(R.anim.fade_in)
    }
    private fun setListeners(viewModel: StartPageViewModel){
        binding.nextPageButton.setOnClickListener {
            if (binding.userNameEditText.text.length < MINIMUM_PASSWORD_LENGTH){
                binding.userNameEditText.error = getString(R.string.passwordErrorMessage)
            }else {
                viewModel.saveUserName(binding.userNameEditText.text.toString())
                viewModel.logUser()
                findNavController().navigate(R.id.action_startPageFragment_to_homeFragment)
            }
        }

    }

    companion object{
        private const val MINIMUM_PASSWORD_LENGTH = 3
    }
}