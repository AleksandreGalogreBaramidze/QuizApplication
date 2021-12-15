package com.example.quizapplication.repository


import com.example.quizapplication.models.Quiz
import com.example.quizapplication.models.QuizItem

interface JsonRepository {
    fun getQuiz(): Quiz
    fun getQuestions(id:Int): QuizItem
}