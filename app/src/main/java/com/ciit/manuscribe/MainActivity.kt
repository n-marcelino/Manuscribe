package com.ciit.manuscribe

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cart = findViewById<ImageView>(R.id.cart)
        cart.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    Cart::class.java
                )
            )
            
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
            
        }
        header.setOnClickListener() {
            startActivity(
                Intent(
                    applicationContext,
                    MainActivity::class.java
                )
            )
            
        }
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home -> return@setOnItemSelectedListener true

                R.id.bottom_search -> {
//                    startActivity(
//                        Intent(
//                            applicationContext,
//                            SearchActivity::class.java
//                        )
//                    )
//                    
//                    
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_bind -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            bind_step1::class.java
                        )
                    )
                    
                    
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_library -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            booklist::class.java
                        )
                    )
                    
                    
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_user -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            User::class.java
                        )
                    )
                    
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}