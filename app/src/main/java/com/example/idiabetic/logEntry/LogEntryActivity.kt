package com.example.idiabetic.logEntry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.idiabetic.R

class LogEntryActivity : AppCompatActivity(), LogEntryView {

    private val presenter = LogEntryPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_entry)
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