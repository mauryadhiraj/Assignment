package com.data.assignment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val android=findViewById<CardView>(R.id.Android)
        val java=findViewById<CardView>(R.id.Java)
        val python=findViewById<CardView>(R.id.Python)
        val php=findViewById<CardView>(R.id.Php)
        val button=findViewById<Button>(R.id.button2)

        android.setOnClickListener {
        val intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("https://www.w3schools.blog/android-tutorial")
            startActivity(intent)
        }

        java.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/java/default.asp")
            startActivity(intent)
        }

        python.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/python/default.asp")
            startActivity(intent)
        }

        php.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/php/default.asp")
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent=Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }

    }
}