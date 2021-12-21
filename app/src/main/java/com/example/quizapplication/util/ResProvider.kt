package com.example.quizapplication.util

import android.content.Context
import androidx.annotation.NonNull
import androidx.annotation.StringRes
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ResProvider @Inject constructor(
    @ApplicationContext val context: Context
) {
    @NonNull
    fun getString(@StringRes resId: Int, vararg formatArgs: Any?): String {
        return context.getString(resId, *formatArgs)
    }
}