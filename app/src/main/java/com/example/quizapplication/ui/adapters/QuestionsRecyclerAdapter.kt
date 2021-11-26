package com.example.quizapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapplication.R
import com.example.quizapplication.databinding.QuestionItemBinding

class QuestionsRecyclerAdapter : RecyclerView.Adapter<QuestionsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(val binding: QuestionItemBinding) : RecyclerView.ViewHolder(binding.root)

    var isChecked = false
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            QuestionItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding.checkerImageView) {
            setOnClickListener {
                setBackgroundResource(if(!isChecked) R.drawable.checked else R.drawable.unchecked)
            }
        }
    }
}