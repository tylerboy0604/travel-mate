package com.example.travel_mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonlogin: Button = findViewById(R.id.Login)
        buttonlogin.setOnClickListener(){
            gotologin();
        }
    }


    fun gotologin(){
        val activitylogin = Intent(this, register::class.java);
        startActivity(activitylogin);

    }


}