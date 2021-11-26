package com.example.quizapplication.ui.start

import androidx.lifecycle.ViewModel
import com.example.quizapplication.user_preferences.UserPreference
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StartPageViewModel @Inject constructor(private val userPreference: UserPreference) :
    ViewModel() {

    fun validateUserName(userName: String, navigation: (() -> Unit?)?, error: () -> Unit) {
        if(userName.length < MINIMUM_PASSWORD_LENGTH) {
            error.invoke()
        }else{
            userPreference.saveName(userName)
            userPreference.currentUser(true)
            navigation?.invoke()
        }
    }

    companion object {
        private const val MINIMUM_PASSWORD_LENGTH = 3
    }
}