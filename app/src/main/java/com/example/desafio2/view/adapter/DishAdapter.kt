package com.example.desafio2.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2.R
import com.example.desafio2.model.Prato
import com.example.desafio2.model.PratoList
import com.google.android.material.card.MaterialCardView

class DishAdapter(
    private val dishList: PratoList,
    private val onItemClicked: (Int) -> Unit
): RecyclerView.Adapter<DishAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_dish, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dishList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return dishList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dish: Prato, onItemClicked: (Int) -> Unit): Unit = with(itemView) {
            // carrega imagem
            //val ivFoto = findViewById<ImageView>(R.id.ivItemDishFoto)
            //Glide.with(itemView.context).load(dish.imagem).into(ivFoto)

            findViewById<TextView>(R.id.tvItemDishNome).text = dish.nome

            findViewById<MaterialCardView>(R.id.vgDishItemContainer).setOnClickListener {
                onItemClicked(adapterPosition)
            }
        }
    }
}
