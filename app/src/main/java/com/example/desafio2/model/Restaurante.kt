package com.example.desafio2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Restaurante (
    val id: Int,
    val nome:String,
    val endereco:String,
    val horario:String,
    val imagem:String,
    //val pratos:PratoList
): Parcelable
