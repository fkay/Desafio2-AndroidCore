package com.example.desafio2.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.desafio2.R
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    private lateinit var tilRegisterNome: TextInputLayout
    private lateinit var tilRegisterEmail: TextInputLayout
    private lateinit var tilRegisterSenha: TextInputLayout
    private lateinit var tilRegisterRepeteSenha: TextInputLayout
    private lateinit var btRegisterRegister: AppCompatButton

    private val tilObrigatory: MutableList<TextInputLayout> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        this.supportActionBar?.title = "Register"


        initComponents()

        setupObservables()
    }

    private fun setupObservables() {
        btRegisterRegister.setOnClickListener() {
            if(validateFields()) {
                val intent = Intent(this, HomeActivity::class.java)

                // tira activity de login
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()
            }
        }
    }

    private fun validateFields():Boolean {
        var validate = true
        tilObrigatory.forEach {
            validate = validate and checkObrigatoryField(it)
        }

        val senha = tilRegisterSenha.editText?.text.toString()
        val repeteSenha = tilRegisterRepeteSenha.editText?.text.toString()

        if (senha.isNotBlank() and repeteSenha.isNotBlank() and (senha != repeteSenha)) {
            tilRegisterRepeteSenha.error = "Senhas devem ser iguais"
            validate = false
        }

        return validate
    }

    private fun checkObrigatoryField(til: TextInputLayout): Boolean {
        val texto = til.editText?.text.toString()

        if(texto.isBlank()) {
            til.error = "Campo obrigatório"
            return false
        } else {
            til.isErrorEnabled = false
            return true
        }
    }

    private fun initComponents() {
        tilRegisterEmail = findViewById(R.id.tilRegisterEmail)
        tilRegisterNome = findViewById(R.id.tilRegisterNome)
        tilRegisterSenha = findViewById(R.id.tilRegisterSenha)
        tilRegisterRepeteSenha = findViewById(R.id.tilRegisterRepeteSenha)
        btRegisterRegister = findViewById(R.id.btRegisterRegister)
        tilObrigatory.addAll( listOf(
            tilRegisterNome,
            tilRegisterEmail,
            tilRegisterSenha,
            tilRegisterRepeteSenha,
            )
        )
    }
}