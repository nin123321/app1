package com.example.forgodssake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_main.*

class ForgotPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        rememberbutton.setOnClickListener() {
            if (forgotEmail.text.isNotEmpty()) {
                Toast.makeText(this, "Please check your E-Mail", Toast.LENGTH_SHORT).show()
                val returntomain = Intent(this, MainActivity::class.java)
                startActivity((returntomain))
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()

            }


        }


        createaccount123.setOnClickListener() {
            val create = Intent(this, CreateUser :: class.java )
            startActivity(create)
        }

    }


}
