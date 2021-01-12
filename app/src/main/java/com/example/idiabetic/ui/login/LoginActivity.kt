package com.example.idiabetic.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.idiabetic.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_bnt.setOnClickListener {
            // the method which should be call when login is pressed
        }
    }

    private fun login(username: String, password: String) {

    }
}