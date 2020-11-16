package com.example.desafio2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Prato (
    val nome: String,
    val detalhes: String,
    val imagem: String
):Parcelable