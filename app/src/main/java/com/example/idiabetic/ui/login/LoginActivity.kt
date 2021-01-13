package com.example.idiabetic.ui.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.idiabetic.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_bnt.setOnClickListener {
            // the method which should be called when login is pressed
            login(
                    login_username.text.toString(),
                    login_password.text.toString()
            )
        }

    }



    private fun login(username: String, password: String) {
        Toast.makeText(this, "$username and $password", Toast.LENGTH_LONG).show()
    }

}