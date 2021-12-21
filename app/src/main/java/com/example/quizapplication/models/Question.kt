package com.example.quizapplication.models

data class Question(
    val answers: List<String>,
    val correctAnswer: String,
    val questionIndex: Int,
    val questionTitle: String
)