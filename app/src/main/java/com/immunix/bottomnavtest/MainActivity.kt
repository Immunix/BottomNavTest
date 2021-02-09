package com.immunix.bottomnavtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.immunix.bottomnavtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.background = null
        binding.bottomNav.menu.getItem(2).isEnabled = false
    }
}