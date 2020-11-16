package com.example.desafio2.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.desafio2.R
import com.example.desafio2.model.Restaurante
import com.example.desafio2.view.adapter.DishAdapter
import com.example.desafio2.view.adapter.RestaurantAdapter
import com.example.desafio2.viewModel.HomeViewModel
import com.example.desafio2.viewModel.RestaurantViewModel

class RestaurantActivity : AppCompatActivity() {
    private var restaurante: Restaurante? = null

    private lateinit var viewModel: RestaurantViewModel

    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.rvRestaurantDishList)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        restaurante =   intent.getParcelableExtra<Restaurante>(HomeActivity.KEY_INTENT_RESTAURANTE)

        setupRestaurante()

        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
        viewModel.getPratos(restaurante?.id)

        setObservables()
    }

    private fun setObservables() {
        viewModel.dishesLiveData.observe(this) {
            it?.let{ dishes ->
                recyclerView.apply {
                    layoutManager = GridLayoutManager(this@RestaurantActivity, 2)
                    adapter = DishAdapter(dishes) { position ->
                        val intent = Intent(this@RestaurantActivity, PratoActivity::class.java)
                        intent.putExtra(KEY_INTENT_PRATO, dishes[position])
                        startActivity(intent)

                        Log.i("Restaurante", "Cliquei no prato ${position + 1}")
                    }
                }
            }
        }
    }


    fun setupRestaurante() {
        //carrega imagem
        val ivRestaurantFoto = findViewById<ImageView>(R.id.ivRestaurantFoto)
        Glide.with(this).load(restaurante?.imagem).into(ivRestaurantFoto)

        findViewById<TextView>(R.id.tvRestaurantNome).text = restaurante?.nome
    }

    companion object {
        const val KEY_INTENT_PRATO = "prato"
    }
}