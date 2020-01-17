package com.example.forgodssake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_after_login.*

class AfterLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        logoutbutton.setOnClickListener() {
            val logout = Intent(this, MainActivity :: class.java)
            startActivity(logout)
        }


    }



}
