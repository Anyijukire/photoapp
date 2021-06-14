package com.example.photoappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class photo2 : AppCompatActivity() {
    lateinit var button4:Button
    lateinit var button5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo2)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button4.setOnClickListener {
            val intent4=Intent(baseContext, photo1::class.java)
            startActivity(intent4)
        }
        button5.setOnClickListener {
            val intent5=Intent(baseContext,photo3::class.java)
            startActivity(intent5)
        }
    }
}