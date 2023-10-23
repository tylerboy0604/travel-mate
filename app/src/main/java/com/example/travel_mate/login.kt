package com.example.travel_mate

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var buttonhome: Button = findViewById(R.id.signin)
        buttonhome.setOnClickListener(){
            gotohome();
        }
        var btnRegister: Button = findViewById(R.id.btRegister);
        btnRegister.setOnClickListener() {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

        var btnLogin: Button = findViewById(R.id.btLogin);
        btnLogin.setOnClickListener() {
            var helper = MyDBHelper(applicationContext)
            var cr: Cursor;

            var editTextMail: EditText = findViewById(R.id.etMail);
            var editTextPassword: EditText = findViewById(R.id.etPassword);


            cr = helper.loginCheck(editTextMail.text.toString(), editTextPassword.text.toString());

            if (cr.getCount() > 0) {
                val intent = Intent(this, welcome::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Logingegevens zijn niet correct!", Toast.LENGTH_LONG).show()
            }
        }

    }
    fun gotohome(){
        val activityhome = Intent(this, homepage::class.java);
        startActivity(activityhome);


    }
}