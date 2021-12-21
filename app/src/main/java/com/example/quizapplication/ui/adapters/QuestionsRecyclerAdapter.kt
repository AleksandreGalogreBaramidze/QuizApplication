package com.example.quizapplication.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapplication.databinding.QuestionItemBinding
import com.example.quizapplication.util.answer


class QuestionsRecyclerAdapter : RecyclerView.Adapter<QuestionsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(val binding: QuestionItemBinding) : RecyclerView.ViewHolder(binding.root)
    var alreadyChecked = DEFAULT_CHECKER
    lateinit var answer: answer
    private var data = mutableListOf<String>()
    private lateinit var item: String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            QuestionItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() =  data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        item = data[position]
        with(holder.binding){
            answerTextView.text = item
            isChecked(holder.binding.answersCheckBox, position, item , root)
            answersCheckBox.isClickable = alreadyChecked != position
            root.isClickable = alreadyChecked != position
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun isChecked(checkBox: CheckBox, position: Int, answer: String, item: CardView) {
        checkBox.isChecked = alreadyChecked == position

        item.setOnClickListener {
            alreadyChecked = position
            this.answer.invoke(answer)
            notifyDataSetChanged()
        }

        checkBox.setOnClickListener {
            alreadyChecked = position
            this.answer.invoke(answer)
            notifyDataSetChanged()
        }


    }
    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<String>) {
        with(this.data){
            clear()
            data.toMutableList()
        }
        notifyDataSetChanged()
    }

    companion object {
        private const val DEFAULT_CHECKER = -1
    }
}