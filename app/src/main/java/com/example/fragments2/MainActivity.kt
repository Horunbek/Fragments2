package com.example.fragments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tiliFragment = TiliFragment()
        val transition = supportFragmentManager.beginTransaction()

        transition.add(R.id.container, tiliFragment)
        transition.commit()
    }
}