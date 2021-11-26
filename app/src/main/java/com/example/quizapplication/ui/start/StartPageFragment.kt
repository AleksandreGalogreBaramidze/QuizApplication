package com.example.quizapplication.ui.start


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapplication.R
import com.example.quizapplication.databinding.StartPageFragmentBinding
import com.example.quizapplication.ui.basefragment.BaseFragment

class StartPageFragment : BaseFragment<StartPageFragmentBinding, StartPageViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> StartPageFragmentBinding get() = StartPageFragmentBinding::inflate
    override fun getViewModel() = StartPageViewModel::class.java
    override fun initFragment(viewModel: StartPageViewModel) {
        setListeners()
    }

    private fun setListeners(){
        binding.nextPageButton.setOnClickListener {
            findNavController().navigate(R.id.action_startPageFragment_to_homeFragment)
        }
    }
}