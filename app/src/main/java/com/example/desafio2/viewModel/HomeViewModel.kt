package com.example.desafio2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.desafio2.model.Restaurante
import com.example.desafio2.model.home.HomeBusiness

class HomeViewModel: ViewModel() {
    val restaurantesLiveData: MutableLiveData<List<Restaurante>> = MutableLiveData()
    val homeBusiness:HomeBusiness = HomeBusiness()

    fun getRestaurantes() {
        restaurantesLiveData.postValue(
            homeBusiness.getRestaurantes()
        )
    }
}