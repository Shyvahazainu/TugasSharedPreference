package com.example.pbmsharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


//Nama : Shyva Annisa Hazainu
//NPM : 2008107010055
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mendapatkan nilai yang dimasukkan pengguna ke
        // dalam EditText dan mencetaknya ke console saat tombol ditekan

        //untuk button berdasarkan id yang kita buat di activity_main
        val btnPrintPrefs = findViewById<Button>(R.id.btnPrint)

        // buat fungsi click pada button sehingga setelah ditekan
        // akan muncul value pada console
        btnPrintPrefs.setOnClickListener {
            // untuk mengambil username dan password dari shared preferencenya
            val usernameEditText = findViewById<EditText>(R.id.editText)
            val passwordEditText = findViewById<EditText>(R.id.editText2)

            // ambil value dari editText
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // print value-value tersebut ke console
            println("Username: $username")
            println("Password: $password")
        }
    }
}