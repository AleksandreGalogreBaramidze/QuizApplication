package com.example.quizapplication.ui.questions


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.quizapplication.databinding.QuestionsFragmentBinding
import com.example.quizapplication.ui.basefragment.BaseFragment

class QuestionsFragment : BaseFragment<QuestionsFragmentBinding, QuestionsViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> QuestionsFragmentBinding get() = QuestionsFragmentBinding::inflate
    override fun getViewModel() = QuestionsViewModel::class.java
    override fun initFragment(viewModel: QuestionsViewModel) {
        TODO("Not yet implemented")
    }
}