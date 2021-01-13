package com.example.idiabetic.logEntry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.idiabetic.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_log_entry.*

class LogEntryActivity() : AppCompatActivity(), LogEntryView {

    val database = FirebaseDatabase.getInstance("https://idiabetic-ad8f3-default-rtdb.firebaseio.com/")
    val entryRef : DatabaseReference = database.getReference("entry")
    private val presenter = LogEntryPresenter(entryRef)

    override val glucose: Int
        get() = glucose_view.text.toString().toInt()

    override val carbs: Long
        get() = carbo_view.text.toString().toLong()

    override val insulin: Long
        get() = insulin_view.text.toString().toLong()

    override var testRead: String?
        get() = text_read.text.toString()
        set(value) {
            text_read.text = value
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_entry)

        add_glucose.setOnClickListener {
            presenter.addEntry()
        }
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