package com.example.moviehub

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VerifyPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_verify_password)

        var button3 = findViewById<TextView>(R.id.btn_verify)
        button3.setOnClickListener{
            val intent1 = Intent(this,Change_Password::class.java)
            startActivity(intent1)
        }

        var button4 = findViewById<ImageButton>(R.id.btn_back)
        button4.setOnClickListener{
            val intent1 = Intent(this,Forgot_Password::class.java)
            startActivity(intent1)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}