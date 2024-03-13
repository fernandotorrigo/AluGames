package br.com.alura.alugames.utils

import br.com.alura.alugames.model.DataGameJson
import br.com.alura.alugames.model.Game

fun DataGameJson.createGame(): Game {
    return Game(this.titulo, this.capa, this.price, this.description)
}