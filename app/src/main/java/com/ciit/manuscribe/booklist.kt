package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
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
//        val image = findViewById<ImageView>(R.id.bookCover)
//        image.setOnClickListener() {
//            startActivity(
//                Intent(
//                    applicationContext,
//                    page::class.java
//                )
//            )
//            
//            finish()
//        }

    }
}