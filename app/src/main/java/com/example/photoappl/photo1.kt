package com.example.photoappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class photo1 : AppCompatActivity() {
    lateinit var button2: Button
    lateinit var button3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button2.setOnClickListener {
            val intent2=Intent(baseContext, photo2::class.java)
            startActivity(intent2)
        }
        button3.setOnClickListener {
            val intent3=Intent(baseContext, MainActivity::class.java)
            startActivity(intent3)
        }
    }
}