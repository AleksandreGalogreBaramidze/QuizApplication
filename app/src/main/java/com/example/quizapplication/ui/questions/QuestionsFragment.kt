package com.example.quizapplication.ui.questions


import android.app.Dialog
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapplication.R
import com.example.quizapplication.databinding.QuestionsFragmentBinding
import com.example.quizapplication.extensions.observe
import com.example.quizapplication.extensions.createDialog
import com.example.quizapplication.extensions.showDialog
import com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter
import com.example.quizapplication.ui.basefragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuestionsFragment : BaseFragment<QuestionsFragmentBinding, QuestionsViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> QuestionsFragmentBinding get() = QuestionsFragmentBinding::inflate
    override fun getViewModel() = QuestionsViewModel::class.java

    private val args: QuestionsFragmentArgs by navArgs()

    private lateinit var questionsRecyclerAdapter: QuestionsRecyclerAdapter
    private lateinit var userName: String
    override fun initFragment(viewModel: QuestionsViewModel) {

        initRecycler()
        userName = args.userName
        viewModel.setOption(args.id)
        viewModel.question(args.id)
        setListeners(viewModel)
        addScore(viewModel)

        observe(viewModel.optionLiveData) { subject ->
            binding.subjectTitle.text = subject.quizTitle
            viewModel.questionsLimit = subject.questionsCount
        }

        observe(viewModel.questionLiveData) { question ->
            binding.questionTextView.text = question.questionTitle
            questionsRecyclerAdapter.setData(question.answers)
        }


        observe(viewModel.isQuizEnded) {
            if (it) {
                viewModel.saveScore(userName)
            }
        }
        observe(viewModel.scoreLiveData){ score ->
            dialog(getString(R.string.dialog_text,userName,score))
            findNavController().navigateUp()
        }

    }

    private fun initRecycler(){
        with(binding.subjectsRecyclerView) {
            questionsRecyclerAdapter = QuestionsRecyclerAdapter()
            layoutManager = LinearLayoutManager(requireContext())
            adapter = questionsRecyclerAdapter
        }
    }

    private fun addScore(viewModel: QuestionsViewModel){
        questionsRecyclerAdapter.answer = { userAnswer ->
            viewModel.correctAnswers(args.id,userAnswer)
        }
    }

    private fun dialog(dialogText: String) {
        requireContext().showDialog(dialogText)
    }
    private fun setListeners(viewModel: QuestionsViewModel) {
        binding.questionNextButton.setOnClickListener {
            with(viewModel) {
                indexOfQuestion++
                question(args.id)
                isQuizEnded()
                addScore()
                btnUnClickable(it)
                questionsRecyclerAdapter.alreadyChecked = UNCHECKED
            }
        }
        binding.backImageView.setOnClickListener {
            findNavController().navigateUp()
        }

    }

    companion object {
        private const val UNCHECKED = -1
    }


}