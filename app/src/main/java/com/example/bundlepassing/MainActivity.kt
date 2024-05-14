package com.example.bundlepassing

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bundlepassing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val name = binding.etName.text.toString()
            val fathersName = binding.etFathersName.text.toString()
            val rollNumber = binding.etRollNumber.text.toString()
            val phoneNumber = binding.etPhoneNo.text.toString()

            val intent  = Intent(this,SecondActivity::class.java)

            intent.putExtra("name",name)
            intent.putExtra("fathersName",fathersName)
            intent.putExtra("rollNumber",rollNumber)
            intent.putExtra("phoneNumber",phoneNumber)


            startActivity(intent)


        }

    }
}