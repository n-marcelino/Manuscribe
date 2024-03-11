package com.ciit.manuscribe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)


        val addorder = findViewById<Button>(R.id.addorder)
        addorder.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    bind_step1::class.java
                )
            )
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

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

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            MainActivity::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_search -> {
//                    startActivity(
//                        Intent(
//                            applicationContext,
//                            SearchActivity::class.java
//                        )
//                    )
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_bind -> {
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

                R.id.bottom_library -> {
//                    startActivity(
//                        Intent(
//                            applicationContext,
//                            SearchActivity::class.java
//                        )
//                    )
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_user -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            User::class.java
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