package com.example.allinoneproject

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Change status bar text color here
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // For Android 11 (API level 30) and higher
            window.decorView.windowInsetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // For versions prior to Android 11 (API level 30)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

        // initialized variable
        val cardWebView = findViewById<CardView>(R.id.webView)
        val cardLogIn = findViewById<CardView>(R.id.cardLogIn)

        // webView cardView
        cardWebView.setOnClickListener {
            val intentWeb = Intent(this, WebViewActivity::class.java)
            startActivity(intentWeb)
        }

        // logIn cardView code here
        cardLogIn.setOnClickListener {
            val intentLogIn = Intent(this, LogInActivity::class.java)
            startActivity(intentLogIn)
        }

    }
}