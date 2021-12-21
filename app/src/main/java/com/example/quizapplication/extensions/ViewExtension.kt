package com.example.quizapplication.extensions

import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible

fun View.startAnimation(anim: Int) {
    val animation = AnimationUtils.loadAnimation(context, anim)
    this.startAnimation(animation)
}

fun View.startActionAfterAnimation(anim: Int, action: () -> Unit) {
    val animation = AnimationUtils.loadAnimation(context, anim)
    if(animation.hasEnded()){
        action()
    }
    this.startAnimation(animation)
}

