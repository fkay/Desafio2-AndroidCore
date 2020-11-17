package com.example.desafio2.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.desafio2.R
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    private lateinit var tilLoginEmail: TextInputLayout
    private lateinit var tilLoginSenha: TextInputLayout
    private lateinit var btLogin: AppCompatButton
    private lateinit var btLoginRegister: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initComponents()

        setObservables()


    }

    private fun setObservables() {
        btLogin.setOnClickListener() {
            if(validateFields()) {
                startActivity(Intent(this, HomeActivity::class.java))

                // close this activity
                finish()
            }
        }

        btLoginRegister.setOnClickListener() {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun initComponents() {
        tilLoginEmail = findViewById(R.id.tilLoginEmail)
        tilLoginSenha = findViewById(R.id.tilLoginSenha)
        btLogin = findViewById(R.id.btLogin)
        btLoginRegister = findViewById(R.id.btLoginRegister)
    }

    private fun validateFields(): Boolean {
        val email = tilLoginEmail.editText?.text.toString()
        val senha = tilLoginSenha.editText?.text.toString()

        var validate = true

        if(email.isBlank()) {
            tilLoginEmail.error = "Campo obrigatório"
            validate = false
        } else {
            tilLoginEmail.isErrorEnabled = false
        }

        if(senha.isBlank()) {
            tilLoginSenha.error = "Campo obrigatório"
            validate = false
        } else {
            tilLoginSenha.isErrorEnabled = false
        }
        return validate
    }
}