package com.d121201022.taskmanagement.util

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.DateFormat

@BindingAdapter("setPriority")
fun setPriority(view: TextView, priority: Int){
    when(priority){
        0->{
            view.text = "Penting Mendesak"
            view.setTextColor(Color.RED)
        }
        1->{
            view.text = "Tidak Penting Mendesak"
            view.setTextColor(Color.YELLOW)
        }
        2->{
            view.text = "Penting Tidak Mendesak"
            view.setTextColor(Color.BLUE)
        }
        else->{
            view.text = "Tidak Penting Tidak Mendesak"
            view.setTextColor(Color.GREEN)
        }
    }
}

@BindingAdapter("setTimestamp ")
fun setTimestamp(view: TextView, timestamp: Long){
    view.text = DateFormat.getInstance().format(timestamp)
}