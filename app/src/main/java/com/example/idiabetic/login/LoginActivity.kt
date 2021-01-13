package com.example.idiabetic.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.idiabetic.R
import com.example.idiabetic.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), LoginView {

    private val presenter = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_bnt.setOnClickListener {
            // the method which should be called when login is pressed
            presenter.login(
                    login_username.text.toString(),
                    login_password.text.toString()
            )
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

    override fun showMessage(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    override fun goNextScreen() {
        Toast.makeText(this, "succes log in", Toast.LENGTH_LONG).show()
        startActivity(Intent(this, MainActivity::class.java))
    }

}