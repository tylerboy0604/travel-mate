package com.example.travel_mate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var userInput: EditText = findViewById(R.id.EDX_UserInput)
        var passwordInput: EditText = findViewById(R.id.EDX_passwordInput)
        var loginButton: Button = findViewById(R.id.signin)
        var UserInputStr = userInput.text.toString()
//        var buttonhome: Button = findViewById(R.id.signin)
//        buttonhome.setOnClickListener(){
//            gotohome();
//        }



        var User = "admin"
        var Passwd = "admin"


        loginButton.setOnClickListener(){



        if (User == UserInputStr) {
//            val activitylogin = Intent(this, homepage::class.java);
//            startActivity(activitylogin);
            println("success")
        } else{
            println("error");
        }
        }

    }
//    fun gotohome(){
//        val activityhome = Intent(this, homepage::class.java);
//        startActivity(activityhome);
//
//
//    }
}