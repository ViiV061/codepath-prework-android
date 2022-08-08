package com.example.helloworld01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //1.add a button to layout
        //2.set up logic to know when user has tapped on button

        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            // Handle button tap
            // Change the color of the text
            Log.i("Tom", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.gold))
        }
    }
}