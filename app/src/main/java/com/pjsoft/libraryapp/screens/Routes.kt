package com.pjsoft.libraryapp.screens

import kotlinx.serialization.Serializable

//SINGLETON - PATRON DE DISEÑO
@Serializable
object BookScreenRoute

@Serializable
object FavoritesScreenRoute

@Serializable
data class BookDetailScreenRoute(val id : Int)