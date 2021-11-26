package com.example.quizapplication.ui.home


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.quizapplication.databinding.HomeFragmentBinding
import com.example.quizapplication.ui.basefragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> HomeFragmentBinding get() = HomeFragmentBinding::inflate
    override fun getViewModel() = HomeViewModel::class.java
    override fun initFragment(viewModel: HomeViewModel) {

    }
}