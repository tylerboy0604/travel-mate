package com.example.travel_mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CreateList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_list)

        var buttonAddPhotosVideos: Button = findViewById(R.id.AddPhotosVideos)
        buttonAddPhotosVideos.setOnClickListener(){
            gotoAddPhotosVideos();
        }

        var buttonAddNotes: Button = findViewById(R.id.AddNotes)
        buttonAddNotes.setOnClickListener(){
            gotoAddNote();
        }

        var buttoncreateNewBoard: Button = findViewById(R.id.createNewBoard)
        buttoncreateNewBoard.setOnClickListener(){
            gotoCreateBoard();
        }
    }

    fun gotoAddPhotosVideos(){
        val activityAddPhotosVideos = Intent(this, AddItem::class.java);
        startActivity(activityAddPhotosVideos);
    }


    fun gotoAddNote(){
        val activityAddNotes = Intent(this, AddItem::class.java);
        startActivity(activityAddNotes);
    }

    fun gotoCreateBoard(){
        val activityCreateBoard = Intent(this, AddItem::class.java);
        startActivity(activityCreateBoard);
    }


}