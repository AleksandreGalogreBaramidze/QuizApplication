package com.example.quizapplication.di

import com.example.quizapplication.parser.JsonParser
import com.example.quizapplication.repository.JsonRepository
import com.example.quizapplication.repository.JsonRepositoryImplementation



import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Provides
    @Singleton
    fun provideRepository(jsonParser: JsonParser): JsonRepository = JsonRepositoryImplementation(jsonParser)
}