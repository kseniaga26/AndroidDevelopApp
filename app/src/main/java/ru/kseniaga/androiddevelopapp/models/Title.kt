package ru.kseniaga.androiddevelopapp.models

import ru.kseniaga.androiddevelopapp.viewModels.getDataBase

data class Title(
    val id: Int,
    val imageUrl: String,
    val title_english: String,
    val title_japanese: String,
    val year: Int,
    val type: String,
    val episodes: Int,
    val status: String,
    val rating: String,
    val score: Double,
    val studios: String,
    val genres: String,
    val description: String,
)

fun getTitleById(id: Int): Title? {

    val titleList = getDataBase()

    return titleList.find { it.id == id }
}
