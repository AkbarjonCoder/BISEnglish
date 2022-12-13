package com.example.bisenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bisenglish.fragment.BISFragment
import com.example.bisenglish.fragment.HomeFragment
import com.example.bisenglish.fragment.MediaFragment
import com.example.bisenglish.fragment.NewsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav = findViewById(R.id.bottomNav)
        bottomNav.setOnNavigationItemReselectedListener {

            when (it.itemId) {
                R.id.hoomeFragment -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.mediaaFragment -> {
                    loadFragment(MediaFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.newssFragment -> {
                    loadFragment(NewsFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.bissFragment -> {
                    loadFragment(BISFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }

        }

    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}