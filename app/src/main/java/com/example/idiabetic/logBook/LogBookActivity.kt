package com.example.idiabetic.logBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.idiabetic.R

class LogBookActivity : AppCompatActivity(), LogBookView {

    val presenter = LogBookPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_book)
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