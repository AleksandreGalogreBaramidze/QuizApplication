package com.example.quizapplication.ui.start

import androidx.lifecycle.ViewModel
import com.example.quizapplication.user_preferences.UserPreference
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StartPageViewModel @Inject constructor(private val userPreference: UserPreference): ViewModel() {

    fun saveUserName(userName:String){
        userPreference.saveName(userName)
    }

    fun logUser(){
        userPreference.currentUser(true)
    }


}