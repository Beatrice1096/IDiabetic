package com.example.idiabetic.models

data class User(
        val name: String,
        val diabetesType: DiabetesType? = null
) {

}

fun test (nume: String) {
    User("sslsls", DiabetesType.TYPE_ONE)
}
