package com.example.travel_mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonhome: Button = findViewById(R.id.button)
        buttonhome.setOnClickListener(){
            gotohome();
        }
    }


    fun gotohome(){
        val activityhome = Intent(this, homepage::class.java);
        startActivity(activityhome);

    }


}