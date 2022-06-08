package com.example.twitterClone.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.twitterclone.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bv_bottom_nav)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container_view_main) as NavHostFragment

        bottomNavigation.setupWithNavController(navHostFragment.navController)
    }
}