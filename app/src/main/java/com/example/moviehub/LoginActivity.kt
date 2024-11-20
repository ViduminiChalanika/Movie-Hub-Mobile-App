package com.example.moviehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        var button2 = findViewById<Button>(R.id.btn_login)
        button2.setOnClickListener{
            val intent2 = Intent(this,Navigation::class.java)
            startActivity(intent2)
        }

        var button3 = findViewById<TextView>(R.id.textView6)
        button3.setOnClickListener{
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