package com.example.photoappl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class photo3 : AppCompatActivity() {
    lateinit var button6:Button
    lateinit var button7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo3)
        button6=findViewById(R.id.button6)
        button7=findViewById(R.id.button7)
        button6.setOnClickListener {
            val intent6=Intent(baseContext, photo2::class.java)
            startActivity(intent6)
        }
        button7.setOnClickListener {
            val intent8=Intent(baseContext,photo4::class.java)
            startActivity(intent8)
        }
    }
}