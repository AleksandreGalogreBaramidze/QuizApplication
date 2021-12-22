package com.example.quizapplication.ui.start



import androidx.lifecycle.ViewModel
import com.example.quizapplication.user_preference.UserPreference
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StartPageViewModel @Inject constructor(private val userPreference: UserPreference): ViewModel() {

    private fun saveUserName(userName:String){
        userPreference.saveName(userName)
    }

    private fun logUser(){
        userPreference.currentUser(true)
    }

    fun validateUserName(userName: String, navigation: (() -> Unit?)?, error: () -> Unit) {
        if (userName.length < MINIMUM_PASSWORD_LENGTH){
            error.invoke()
        }else {
            saveUserName(userName)
            logUser()
            navigation?.invoke()
        }
    }

    companion object{
        private const val MINIMUM_PASSWORD_LENGTH = 3
    }

}