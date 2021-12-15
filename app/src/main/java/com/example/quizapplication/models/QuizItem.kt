package com.example.quizapplication.models

data class QuizItem(
    val id: String,
    val questions: List<Question>,
    val questionsCount: Int,
    val quizDescription: String,
    val quizTitle: String
)