package com.example.desafio2.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.desafio2.R
import com.example.desafio2.model.Prato
import com.example.desafio2.model.Restaurante

class PratoActivity : AppCompatActivity() {
    private var prato: Prato? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato)

        prato = intent.getParcelableExtra<Prato>(RestaurantActivity.KEY_INTENT_PRATO)

        setupPrato()
    }

    private fun setupPrato() {
        val ivDishFoto = findViewById<ImageView>(R.id.ivDishFoto)
        Glide.with(this).load(prato?.imagem).into(ivDishFoto)

        findViewById<TextView>(R.id.tvDishNome).text = prato?.nome
        findViewById<TextView>(R.id.tvDishDescricao).text = prato?.detalhes
    }
}