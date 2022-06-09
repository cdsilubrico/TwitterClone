package com.example.twitterClone.ui.activity

import android.content.Intent
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

        finish()
        startActivity(Intent(this,Auth::class.java))

//        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bvv_btm_nav)
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
//
//        bottomNavigation.setupWithNavController(navHostFragment.navController)
    }
}