package com.example.idiabetic.logBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.idiabetic.R
import com.example.idiabetic.models.HistoryEntry
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_log_book.*

class LogBookActivity : AppCompatActivity(), LogBookView {


    val database = FirebaseDatabase.getInstance("https://idiabetic-ad8f3-default-rtdb.firebaseio.com/")
    val entryRef : DatabaseReference = database.getReference("entry")
    val presenter = LogBookPresenter(entryRef)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_book)

    }

    override fun populateList(list: List<HistoryEntry>) {
        val layoutManager = LinearLayoutManager(this)
        history_list.layoutManager = layoutManager
        history_list.adapter = HistoryEntryAdapter(list)
    }

    override fun onStart() {
        super.onStart()
        presenter.bind(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbind()
    }
}