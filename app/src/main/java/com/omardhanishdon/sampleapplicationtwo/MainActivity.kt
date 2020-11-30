package com.omardhanishdon.sampleapplicationtwo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val signinButton = findViewById<Button>(R.id.signin)

        signinButton.setOnClickListener {
            Toast.makeText(this , "Hello please wait......." , Toast.LENGTH_SHORT).show()
        }


    }


}