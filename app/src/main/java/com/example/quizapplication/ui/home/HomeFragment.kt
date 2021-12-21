package com.example.quizapplication.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapplication.R
import com.example.quizapplication.databinding.HomeFragmentBinding
import com.example.quizapplication.extensions.startAnimation
import com.example.quizapplication.extensions.observe
import com.example.quizapplication.extensions.startActionAfterAnimation
import com.example.quizapplication.ui.adapters.HomeRecyclerAdapter
import com.example.quizapplication.ui.basefragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> HomeFragmentBinding get() = HomeFragmentBinding::inflate
    override fun getViewModel() = HomeViewModel::class.java
    private lateinit var userName : String

    private lateinit var homeRecyclerAdapter: HomeRecyclerAdapter
    override fun initFragment(viewModel: HomeViewModel) {
        startAnimation()
        viewModel.getOptions()
        viewModel.getUserPreferences()
        viewModel.getUserName()
        initRecycler()
        setData(viewModel)
        setListeners(viewModel)
    }

    private fun startAnimation(){
        binding.root.startAnimation(R.anim.fade_in)
    }

    private fun initRecycler(){
        with(binding.subjectsRecyclerView) {
            homeRecyclerAdapter = HomeRecyclerAdapter()
            layoutManager = LinearLayoutManager(requireContext())
            adapter = homeRecyclerAdapter
        }
        homeRecyclerAdapter.getSubjectId = {
            binding.root.startActionAfterAnimation(R.anim.fade_out){
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToQuestionsFragment(it, userName))
            }
        }
    }

    private fun setListeners(viewModel: HomeViewModel){
        binding.logOutButton.setOnClickListener {
            viewModel.logOut()
            findNavController().navigate(R.id.action_homeFragment_to_startPageFragment)
        }
    }

    private fun setData(viewModel: HomeViewModel){
        observe(viewModel.nameLivedata){
            binding.greetingTextView.text = it
        }
        observe(viewModel.optionLiveData){ Options ->
            homeRecyclerAdapter.setData(Options)
        }
        observe(viewModel.userNameLiveData){ userName->
            this.userName = userName
        }
    }
}