package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)


        val logo = findViewById<ImageView>(R.id.logo)
        val header = findViewById<TextView>(R.id.header)
        logo.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }
        header.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        val userNavigationView = findViewById<BottomNavigationView>(R.id.userNavigation)
        userNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {

                R.id.user_bind -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            bind_step1::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.user_library -> {
//                    startActivity(
//                        Intent(
//                            applicationContext,
//                            bind_step1::class.java
//                        )
//                    )
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.user_cart -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Cart::class.java
                        )
                    )
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
        
        
    }
}