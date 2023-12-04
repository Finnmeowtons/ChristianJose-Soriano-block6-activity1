package com.soriano.christianjose.block6.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soriano.christianjose.block6.p1.quiz.databinding.ActivityPinkBinding

class PinkActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPinkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainActivity.setOnClickListener {
            val intent = Intent(this@PinkActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}