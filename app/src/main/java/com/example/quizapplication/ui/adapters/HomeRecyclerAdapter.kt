package com.example.quizapplication.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapplication.databinding.TopicItemBinding
import com.example.quizapplication.models.Quiz
import com.example.quizapplication.models.QuizItem
import com.example.quizapplication.util.getSubjectId


class HomeRecyclerAdapter : RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>() {
    private var data = mutableListOf<QuizItem>()
    lateinit var getSubjectId : getSubjectId
    private lateinit var item: QuizItem
    class ViewHolder(val binding: TopicItemBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            TopicItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = data.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        item = data[position]
        with(holder.binding){
            subjectOptionTitleTextView.text = item.quizTitle
            subjectOptionDescriptionTextView.text = item.quizDescription
            subjectOptionNextButton.setOnClickListener {
                getSubjectId(position)
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: Quiz) {
        with(this.data){
            clear()
            data.toMutableList()
        }
        notifyDataSetChanged()
    }
}