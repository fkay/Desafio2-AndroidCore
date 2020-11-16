package com.example.desafio2.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.desafio2.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<AppCompatButton>(R.id.btLogin).setOnClickListener() {
            startActivity(Intent(this,HomeActivity::class.java))

            // close this activity
            finish()
        }

        findViewById<AppCompatButton>(R.id.btRegister).setOnClickListener() {
            startActivity(Intent(this,RegisterActivity::class.java ))
        }
    }
}