package com.example.desafio2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.desafio2.model.Prato
import com.example.desafio2.model.PratoList
import com.example.desafio2.model.home.HomeBusiness

class RestaurantViewModel: ViewModel() {
    val dishesLiveData: MutableLiveData<PratoList> = MutableLiveData()
    val homeBusiness: HomeBusiness = HomeBusiness()

    fun getPratos(restaurante: Int?) {
        dishesLiveData.postValue(
            restaurante?.let {
                homeBusiness.getDishes(it)
            }
        )
    }
}