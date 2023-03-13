package com.example.firstapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt = findViewById<TextView>(R.id.txt)

        txt.text = "HALLO TIGA HARI LALU TANGGAL LIVERPOOL VS MU MARET 2023"

        var img = findViewById<ImageView>(R.id.img)

        img.setOnClickListener {
            val toas = Toast.makeText(this,"Telah ditekan", Toast.LENGTH_SHORT)
            toas.show()
            Log.d("AKSI","Telah ditekan cuy")

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}