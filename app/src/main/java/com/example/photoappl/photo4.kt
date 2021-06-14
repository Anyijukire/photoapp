package com.example.photoappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class photo4 : AppCompatActivity() {
    lateinit var button9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo4)
        button9=findViewById(R.id.button9)
        button9.setOnClickListener {
            val intent9=Intent(baseContext,photo3::class.java)
            startActivity(intent9)
        }
    }
}