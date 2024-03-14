package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val logo = findViewById<ImageView>(R.id.logo)
        val header = findViewById<TextView>(R.id.header)
        logo.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
        }
        header.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
        }

        val bind = findViewById<Button>(R.id.bindbtn)
        bind.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step1::class.java
                )
            )
        }

        val readBtn = findViewById<Button>(R.id.ReadBtn)
        readBtn.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    page::class.java
                )
            )
        }
    }
}