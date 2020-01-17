package com.example.forgodssake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        forgotbutton.setOnClickListener() {
            val forgot = Intent(this, ForgotPassword :: class.java )
            startActivity(forgot)
        }


        createaccount.setOnClickListener() {
            val create = Intent(this, CreateUser :: class.java )
            startActivity(create)
        }
    }

    fun init() {
        loginButton.setOnClickListener() {
            if (emailText.text.isNotEmpty() && passwordText.text.isNotEmpty() && passwordText.text.length > 8 && passwordText.text.isDigitsOnly() == false) {
                Toast.makeText(this, "Log In Success", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, AfterLogin :: class.java )
                    startActivity(intent)


            } else {
                Toast.makeText(this, "Enter Valid E-Mail or Password", Toast.LENGTH_SHORT).show()
            }
        }
    }




}


