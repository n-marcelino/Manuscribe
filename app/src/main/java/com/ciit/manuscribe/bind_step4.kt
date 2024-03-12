package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class bind_step4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_step4)

        val goback = findViewById<LinearLayout>(R.id.goback)
        goback.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step3::class.java
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
        val checkout = findViewById<Button>(R.id.checkout)
        checkout.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    Cart::class.java
                )
            )

            
        }
    }
}