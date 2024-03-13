package br.com.alura.alugames.model

interface Recomendable {
    val media: Double

    fun recomend(nota: Int)
}