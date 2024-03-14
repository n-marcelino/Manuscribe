package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class booklist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booklist)

        val logo = findViewById<ImageView>(R.id.logo)
        val header = findViewById<TextView>(R.id.header)
        logo.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
            finish()
        }
        header.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
            finish()
        }

        //assigning onclick listeners for the books in booklist
        val books = arrayOf(
            findViewById<LinearLayout>(R.id.book1),
            findViewById<LinearLayout>(R.id.book2),
            findViewById<LinearLayout>(R.id.book3)
        )
        // Create a single OnClickListener instance
        val onClickListener = { view: android.view.View ->
            // Handle the click event
            startActivity(
                Intent(
                    applicationContext,
                    book::class.java
                )
            )

        }
        // set where to go
        books.forEach { book ->
            book.setOnClickListener(onClickListener)
        }
    }
}