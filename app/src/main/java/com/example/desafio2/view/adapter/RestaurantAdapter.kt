package com.example.desafio2.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2.R
import com.example.desafio2.model.Restaurante

class RestaurantAdapter (
    private val restaurantList: List<Restaurante>,
    private val onItemClicked: (Int) -> Unit
): RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_restaurant, parent, false)
        return RestaurantAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(restaurante:Restaurante, onItemClicked: (Int) -> Unit) : Unit = with(itemView) {
            // carrega imagem
            //val ivFoto = findViewById<ImageView>(R.id.ivRestauranteFoto)
            //Glide.with(itemView.context).load(restaurante.imagem).into(ivFoto)

            findViewById<TextView>(R.id.tvRestauranteNome).text = restaurante.nome
            findViewById<TextView>(R.id.tvRestauranteEndereco).text = restaurante.endereco
            findViewById<TextView>(R.id.tvRestauranteHorario).text = "Fechas as ${restaurante.horario}"

            findViewById<ConstraintLayout>(R.id.vgRestaurantItemContainer).setOnClickListener {
                onItemClicked(adapterPosition)
            }
        }
    }

}