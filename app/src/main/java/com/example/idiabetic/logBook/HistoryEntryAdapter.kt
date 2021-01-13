package com.example.idiabetic.logBook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idiabetic.R
import com.example.idiabetic.models.HistoryEntry

class HistoryEntryAdapter(val list: List<HistoryEntry>) : RecyclerView.Adapter<HistoryVM>()   {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryVM {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.history_entry_item, parent, false)
        return HistoryVM(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: HistoryVM, position: Int) {
        holder.setEntry(list[position])
    }

}

class HistoryVM(view: View): RecyclerView.ViewHolder(view){

    var glucose: TextView
    var carbs: TextView
    var insulin: TextView

    init {
        glucose = view.findViewById<TextView>(R.id.glucose_tv)
        carbs = view.findViewById<TextView>(R.id.carbs_tv)
        insulin =view.findViewById(R.id.insulin_tv)
    }

    fun setEntry(entry: HistoryEntry) {
        glucose.text = "glucose: ${entry.glucose}"
        carbs.text = "carbs: ${entry.carbs}"
        insulin.text= "insulin: ${entry.insulin}"
    }
}