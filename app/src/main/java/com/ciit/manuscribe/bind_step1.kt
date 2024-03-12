package com.ciit.manuscribe

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class bind_step1 : AppCompatActivity() {

    var printoptions_array = arrayOf("Black and White", "Coloured")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_step1)

        val printoptions = findViewById<AutoCompleteTextView>(R.id.printoptions)
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, printoptions_array)
        printoptions.setAdapter(adapter)

        val gohome = findViewById<LinearLayout>(R.id.gohome)
        gohome.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
        }
        val cancel = findViewById<Button>(R.id.cancel)
        cancel.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step2::class.java
                )
            )
        }

    }
}