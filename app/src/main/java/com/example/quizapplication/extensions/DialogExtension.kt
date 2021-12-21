package com.example.quizapplication.extensions

import android.app.Dialog
import android.content.Context

import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import com.example.quizapplication.R


fun Dialog.createDialog(contentView: Int) {
    window!!.setBackgroundDrawableResource(android.R.color.transparent)
    window!!.requestFeature(Window.FEATURE_NO_TITLE)
    setContentView(contentView)
    val params = window!!.attributes
    params.width = WindowManager.LayoutParams.MATCH_PARENT
    params.height = WindowManager.LayoutParams.WRAP_CONTENT
}

fun Context.showDialog(dialogText: String) {
    val dialog = Dialog(this)
    dialog.apply {
        createDialog(R.layout.dialog)
        findViewById<TextView>(R.id.userScoreTV).text = dialogText
        findViewById<AppCompatImageButton>(R.id.XBtn).setOnClickListener {
            dialog.cancel()
        }
    }
    dialog.show()
}

