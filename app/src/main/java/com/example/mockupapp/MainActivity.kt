package com.example.mockupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mockupapp.screens.AliciaProfileFragment
import com.example.mockupapp.screens.TatumProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.buttom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.aliciaFragment -> {
                    replaceFragment(AliciaProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.tatumFragment -> {
                    replaceFragment(TatumProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else-> false
            }
        }

        // Set the initial fragment
        replaceFragment(AliciaProfileFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .commit()
    }
}
