package com.example.quizapplication.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/quizapplication/repository/JsonRepository;", "", "getQuestions", "Lcom/example/quizapplication/models/QuizItem;", "id", "", "getQuiz", "Lcom/example/quizapplication/models/Quiz;", "app_debug"})
public abstract interface JsonRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.quizapplication.models.Quiz getQuiz();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.quizapplication.models.QuizItem getQuestions(int id);
}