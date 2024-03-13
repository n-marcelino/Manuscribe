package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.LinearLayout

class bind_step3 : AppCompatActivity() {

    var paymentoptions_array = arrayOf("COD", "Credit/Debit Card", "E-Wallet (G-Cash/Maya)", "Bank Transfer")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_step3)

        val paymentoptions = findViewById<AutoCompleteTextView>(R.id.paymentoptions)
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, paymentoptions_array)
        paymentoptions.setAdapter(adapter)

        val goback = findViewById<LinearLayout>(R.id.goback)
        goback.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step2::class.java
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
                    bind_step4::class.java
                )
            )
            
            
        }

    }
}