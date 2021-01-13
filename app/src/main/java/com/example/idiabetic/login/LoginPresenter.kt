package com.example.idiabetic.login

import com.example.idiabetic.base.BasePresenter
import com.google.firebase.auth.FirebaseAuth

class LoginPresenter(
    val auth: FirebaseAuth = FirebaseAuth.getInstance()
) : BasePresenter<LoginView>() {


    fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task->
            if (task.isSuccessful){
                view?.goNextScreen()
            }else{
                view?.showMessage("NOOO")
            }
        }
    }

    override fun afterBind(view: LoginView) {

    }
}