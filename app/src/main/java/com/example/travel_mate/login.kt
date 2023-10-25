package com.example.travel_mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var userInput: EditText = findViewById(R.id.EDX_UserInput)
        var passwdInput: EditText = findViewById(R.id.EDX_passwordInput)
        var loginButton: Button = findViewById(R.id.signin)

//        var buttonhome: Button = findViewById(R.id.signin)
//        buttonhome.setOnClickListener(){
//            gotohome();
//        }



        var User = "admin"
        var Passwd = "admin"


        loginButton.setOnClickListener(){
            var UserInputStr = userInput.text.toString()
            var PasswdInputStr = passwdInput.text.toString()
            println(UserInputStr)
            println(PasswdInputStr)

        if (User == UserInputStr && Passwd == PasswdInputStr) {
            val activitylogin = Intent(this, homepage::class.java);
            startActivity(activitylogin);
            println("Success")

        } else if(User != UserInputStr || Passwd == PasswdInputStr){
            println("wrong user/pass")
        }

            else{
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