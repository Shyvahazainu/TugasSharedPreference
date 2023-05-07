package com.example.pbmsharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the button
        val btnPrintPrefs = findViewById<Button>(R.id.btn_print_prefs)

        // Set a click listener for the button
        btnPrintPrefs.setOnClickListener {
            // Get the username and password from the shared preferences
            val usernameEditText = findViewById<EditText>(R.id.editText)
            val passwordEditText = findViewById<EditText>(R.id.editText2)

// Get the values from the EditText
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

// Print the values to the console
            println("Username: $username")
            println("Password: $password")
        }
    }
}