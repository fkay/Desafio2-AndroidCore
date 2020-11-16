package com.example.desafio2.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2.R
import com.example.desafio2.view.adapter.RestaurantAdapter
import com.example.desafio2.viewModel.HomeViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var viewModel: HomeViewModel

    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.rvHomeRestaurantList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getRestaurantes()

        setObservables()
    }

    private fun setObservables() {
        viewModel.restaurantesLiveData.observe(this) {
            it?.let{ restaurantes ->
                recyclerView.apply {
                    layoutManager = LinearLayoutManager(this@HomeActivity)
                    adapter = RestaurantAdapter(restaurantes) { position ->
                        val intent = Intent(this@HomeActivity, RestaurantActivity::class.java)
                        intent.putExtra(KEY_INTENT_RESTAURANTE, restaurantes[position])
                        startActivity(intent)

                        Log.i("Restaurante", "Cliquei na restaurante ${position + 1}")
                    }
                }
            }
        }
    }

    companion object {
        const val KEY_INTENT_RESTAURANTE = "restaurante"
    }
}