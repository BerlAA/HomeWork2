package com.berlaa.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var varitableActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()

        varitableActivityButton = findViewById(R.id.varitable_activity_button)

        varitableActivityButton.setOnClickListener {
            val thirdActivityIntent: Intent = Intent(this, ThirdActivity::class.java)
            startActivity(thirdActivityIntent)
        }
    }
}