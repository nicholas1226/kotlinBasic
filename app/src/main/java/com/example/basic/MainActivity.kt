package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener{
            val input = editTextTextPersonName2.text.toString()
            textView3.setText("입력한 값: ${input}")
        }
        button3.setOnClickListener{
            val input = editTextTextPersonName3.text.toString()
            textView3.setText("입력한 값: ${input}")
        }
    }
}