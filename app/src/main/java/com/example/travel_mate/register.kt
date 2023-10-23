package com.example.travel_mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var buttoncontin: Button = findViewById(R.id.contin)
        var buttonsignin: Button = findViewById(R.id.signin)
        buttoncontin.setOnClickListener(){
            gotocontin();
        }
        buttonsignin.setOnClickListener(){
            gotosignin();
        }
    }
    fun gotocontin(){
        val activitycontin = Intent(this, homepage::class.java);
        startActivity(activitycontin);

    }
    fun gotosignin(){
        val activitysignin = Intent(this, login::class.java);
        startActivity(activitysignin);

    }
}