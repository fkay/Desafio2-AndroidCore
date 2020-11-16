package com.example.desafio2.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.desafio2.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<AppCompatButton>(R.id.btRegisterRegister).setOnClickListener() {
            startActivity(Intent(this, HomeActivity::class.java))

            finish()
        }
    }
}