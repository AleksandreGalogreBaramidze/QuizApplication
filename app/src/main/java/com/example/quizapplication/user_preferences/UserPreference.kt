package com.example.quizapplication.user_preferences

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreference @Inject constructor(@ApplicationContext context: Context) {
    private val sharedPreference: SharedPreferences by lazy {
        context.getSharedPreferences(PREFERENCE_TAG, Context.MODE_PRIVATE)
    }
    fun saveName(name: String) {
        sharedPreference.edit().putString(NAME_KEY, name).apply()
    }
    fun currentUser(isActive: Boolean){
        sharedPreference.edit().putBoolean(CURRENT_USER, isActive).apply()
    }
    fun getCurrentUser() = sharedPreference.getBoolean(CURRENT_USER, DEFAULT_CURRENT_USER)

    fun getUserName() = sharedPreference.getString(NAME_KEY, DEFAULT_NAME)

    fun saveScore(score: Int,userName:String) {
        sharedPreference.edit().putInt(userName, score).apply()
    }
    fun getScore(userName:String) = sharedPreference.getInt(userName, DEFAULT_SCORE)
    companion object {
        private const val PREFERENCE_TAG = "user_scores"
        const val NAME_KEY = "name"
        private const val DEFAULT_NAME = ""
        private const val DEFAULT_SCORE = 0
        const val CURRENT_USER = "isActive"
        const val DEFAULT_CURRENT_USER = false
    }
}