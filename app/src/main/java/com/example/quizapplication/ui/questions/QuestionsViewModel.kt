package com.example.quizapplication.ui.questions

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quizapplication.models.Question
import com.example.quizapplication.models.QuizItem
import com.example.quizapplication.repository.JsonRepositoryImplementation
import com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter
import com.example.quizapplication.user_preference.UserPreference
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuestionsViewModel @Inject constructor(
    private val userPreference: UserPreference,
    private val quizRepoImplementation: JsonRepositoryImplementation
) : ViewModel() {
    private var _optionLiveData = MutableLiveData<QuizItem>()
    val optionLiveData: LiveData<QuizItem> = _optionLiveData

    private var _questionLiveData = MutableLiveData<Question>()
    val questionLiveData: LiveData<Question> = _questionLiveData

    private var _answerLiveData = MutableLiveData<String>()
    val answerLiveData: LiveData<String> = _answerLiveData

    private var _scoreLiveData = MutableLiveData<Int>()
    val scoreLiveData: LiveData<Int> = _scoreLiveData

    private var _isQuizEnded = MutableLiveData<Boolean>()
    val isQuizEnded: LiveData<Boolean> = _isQuizEnded

    private val answerScores = mutableListOf<Int>()
    var quizEnded = false
    var questionsLimit = DEFAULT_QUESTIONS_SIZE
    var indexOfQuestion = FIRS_ITEM_INDEX
    var score = DEFAULT_SCORE

    fun correctAnswers(id: Int, userAnswer: String) {
        if((quizRepoImplementation.getQuestions(id).questions[indexOfQuestion].correctAnswer) == userAnswer) {
            score =+ ONE
        }
    }

    fun setOption(id: Int) {
        if (!quizEnded) {
            _optionLiveData.postValue(quizRepoImplementation.getQuestions(id))
        }
    }

    fun question(id: Int) {
        if (!quizEnded) {
            _questionLiveData.postValue(quizRepoImplementation.getQuestions(id).questions[indexOfQuestion])
        }
    }

    fun isQuizEnded() {
        when {
            indexOfQuestion == questionsLimit - ONE -> {
                quizEnded = true
            }
            indexOfQuestion >= questionsLimit -> {
                quizEnded = true
                _isQuizEnded.postValue(true)
            }
            else -> {
                _isQuizEnded.postValue(false)
                quizEnded = false
            }
        }

    }

    fun addScore() {
        answerScores.add(score)
    }

    fun saveScore(userName: String) {
        var scores = DEFAULT_SCORE
        answerScores.forEach { score ->
            scores += score
        }
        _scoreLiveData.postValue(scores)
        userPreference.saveScore(scores, userName)
    }

    fun btnUnClickable(btn: View) {
        if (indexOfQuestion >= questionsLimit) {
            btn.isClickable = false
        }
    }


    companion object {
        private const val FIRS_ITEM_INDEX = 0
        private const val DEFAULT_QUESTIONS_SIZE = 0
        private const val DEFAULT_SCORE = 0
        private const val ONE = 1
    }
}