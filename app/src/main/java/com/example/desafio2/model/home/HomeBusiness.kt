package com.example.desafio2.model.home

import com.example.desafio2.model.PratoList
import com.example.desafio2.model.Restaurante

class HomeBusiness {
    val homeRepository: HomeRepository by lazy {
        HomeRepository()
    }

    fun getRestaurantes(): List<Restaurante> {
        return homeRepository.getRestaurants()
    }

    fun getDishes(restaurante: Int): PratoList {
        return homeRepository.getDishes(restaurante)
    }
}