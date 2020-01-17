package com.example.forgodssake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)



        createuser1.setOnClickListener(){
            if(regadd.text.isNotEmpty() && regel.text.isNotEmpty() && regmob.text.isNotEmpty() && regmob.text.isDigitsOnly() == true && regid.text.isNotEmpty() && regid.text.isDigitsOnly() == true && regpass.text.isNotEmpty() && regpass.text.isDigitsOnly() == false){
                val createuser3 = Intent(this, MainActivity :: class.java)
                startActivity((createuser3))
                Toast.makeText(this, "Please check your E-Mail", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()

            }
        }




    }



}
