package com.example.bundlepassing

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bundlepassing.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.tvName.text = intent.getStringExtra("name")
        binding.tvFathersName.text = intent.getStringExtra("fathersName")
        binding.tvRollNumber.text = intent.getStringExtra("rollNumber")
        binding.tvPhoneNo.text = intent.getStringExtra("phoneNumber")


        binding.btnMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}