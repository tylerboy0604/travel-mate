package com.example.travel_mate

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var buttonNewItem: ImageView = findViewById(R.id.IVNewItems)
        buttonNewItem.setOnClickListener(){
            gotoCreateList();
        }

        var buttonAllItems: ImageView = findViewById(R.id.AllItems)
        buttonAllItems.setOnClickListener(){
            gotoAllItems();
        }

        var buttonBoard: ImageView = findViewById(R.id.Boards)
        buttonBoard.setOnClickListener(){
            gotoBoard();
        }

        var buttonSort: ImageView = findViewById(R.id.Sort)
        buttonSort.setOnClickListener(){
            gotoSort();
        }

        var buttonAccount: ImageView = findViewById(R.id.account)
        buttonAccount.setOnClickListener(){
            gotoAccount();
        }
    }

    fun gotoCreateList(){
        val activityitems = Intent(this, AddItem::class.java);
        startActivity(activityitems);

    }

    fun gotoAllItems(){
        val activityAllItems = Intent(this, Items::class.java);
        startActivity(activityAllItems);

    }

    fun gotoBoard(){
        val activityBoard = Intent(this, Boards::class.java);
        startActivity(activityBoard);

    }

    fun gotoSort(){
        val activitySort = Intent(this, sort::class.java);
        startActivity(activitySort);

    }

    fun gotoAccount(){
        val activityAccount = Intent(this, account::class.java);
        startActivity(activityAccount);

    }

}