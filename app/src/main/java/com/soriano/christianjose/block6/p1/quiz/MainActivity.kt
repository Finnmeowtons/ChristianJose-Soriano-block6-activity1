package com.soriano.christianjose.block6.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soriano.christianjose.block6.p1.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPinkActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, PinkActivity::class.java)
            startActivity(intent)
        }


    }
}