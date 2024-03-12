package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class bind_step3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_step3)

        val goback = findViewById<LinearLayout>(R.id.goback)
        goback.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step2::class.java
                )
            )
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }
        val cancel = findViewById<Button>(R.id.cancel)
        cancel.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step4::class.java
                )
            )
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

    }
}