package com.berlaa.homework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button
    lateinit var varitableActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        nextActivityButton = findViewById(R.id.next_activity_button)
        nextActivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(secondActivityIntent)
        }

        varitableActivityButton = findViewById(R.id.varitable_activity_button)
        varitableActivityButton.setOnClickListener {
            val thirdActivityIntent: Intent = Intent(this, ThirdActivity::class.java)
            startActivity(thirdActivityIntent)
        }
    }


}