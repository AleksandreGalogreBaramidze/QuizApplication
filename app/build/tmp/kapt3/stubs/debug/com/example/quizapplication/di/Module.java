package com.example.quizapplication.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/quizapplication/di/Module;", "", "()V", "provideRepository", "Lcom/example/quizapplication/repository/JsonRepository;", "jsonParser", "Lcom/example/quizapplication/parser/JsonParser;", "app_debug"})
@dagger.Module()
public final class Module {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.quizapplication.di.Module INSTANCE = null;
    
    private Module() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.quizapplication.repository.JsonRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.parser.JsonParser jsonParser) {
        return null;
    }
}