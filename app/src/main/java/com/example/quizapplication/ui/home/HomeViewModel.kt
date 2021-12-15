package com.example.quizapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quizapplication.R
import com.example.quizapplication.models.Quiz
import com.example.quizapplication.repository.JsonRepositoryImplementation
import com.example.quizapplication.user_preferences.UserPreference
import com.example.quizapplication.util.ResProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel@Inject constructor(
    private val userPreference: UserPreference,
    private val resProvider: ResProvider,
    private val quizRepoImplementation: JsonRepositoryImplementation
): ViewModel() {
    private var _nameLiveData = MutableLiveData<String>()
    val nameLivedata: LiveData<String> = _nameLiveData

    private var _userNameLiveData = MutableLiveData<String>()
    val userNameLiveData: LiveData<String> = _userNameLiveData

    private var _optionLiveData = MutableLiveData<Quiz>()
    val optionLiveData: LiveData<Quiz> = _optionLiveData

    fun getOptions() {
        _optionLiveData.postValue(quizRepoImplementation.getQuiz())
    }

    fun getUserName() {
        _userNameLiveData.postValue(userPreference.getUserName())
    }

    fun logOut(){
        userPreference.currentUser(false)
    }
    fun getUserPreferences() {
        val name = userPreference.getUserName()
        val score = userPreference.getScore(userPreference.getUserName()!!)
        _nameLiveData.postValue(resProvider.getString(
            R.string.welcome_text,
            name,
            score
        ))
    }
}