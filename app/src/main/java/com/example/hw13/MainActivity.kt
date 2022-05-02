package com.example.hw13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView).apply {
                val s = Task2(20,20)
            s.setAge()
            s.setWeight()
            text = s.getAge().toString()
        }
    }
}