package com.example.quizapplication.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/quizapplication/repository/JsonRepositoryImplementation;", "Lcom/example/quizapplication/repository/JsonRepository;", "json", "Lcom/example/quizapplication/parser/JsonParser;", "(Lcom/example/quizapplication/parser/JsonParser;)V", "getQuestions", "Lcom/example/quizapplication/models/QuizItem;", "id", "", "getQuiz", "Lcom/example/quizapplication/models/Quiz;", "app_debug"})
@javax.inject.Singleton()
public final class JsonRepositoryImplementation implements com.example.quizapplication.repository.JsonRepository {
    private final com.example.quizapplication.parser.JsonParser json = null;
    
    @javax.inject.Inject()
    public JsonRepositoryImplementation(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.parser.JsonParser json) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.quizapplication.models.Quiz getQuiz() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.quizapplication.models.QuizItem getQuestions(int id) {
        return null;
    }
}