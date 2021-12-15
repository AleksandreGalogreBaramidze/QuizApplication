package com.example.quizapplication.repository

import com.example.quizapplication.models.Quiz
import com.example.quizapplication.models.QuizItem
import com.example.quizapplication.parser.JsonParser
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JsonRepositoryImplementation @Inject constructor(private val json: JsonParser) : JsonRepository {
    override  fun getQuiz(): Quiz {
        return json.getResponse()
    }

    override  fun getQuestions(id: Int): QuizItem {
        return json.getResponse()[id]
    }
}