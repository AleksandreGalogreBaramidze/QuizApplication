package com.example.quizapplication.parser

import android.content.Context
import com.example.quizapplication.models.Quiz
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JsonParser @Inject constructor(@ApplicationContext val context: Context) {

    fun getResponse(): Quiz {
        val json = context.assets.open(JSON).bufferedReader().use { it.readText() }
        return Gson().fromJson(json, Quiz::class.java)
    }
    companion object {
        private const val JSON = "quizzes.json"
    }
}