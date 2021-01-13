package com.example.idiabetic.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.idiabetic.R
import com.example.idiabetic.logBook.LogBookActivity
import com.example.idiabetic.logEntry.LogEntryActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log_entry_btn.setOnClickListener {
            startActivity(Intent(this, LogEntryActivity::class.java))
        }

        log_book_btn.setOnClickListener {
            startActivity(Intent(this, LogBookActivity::class.java))
        }
    }
}