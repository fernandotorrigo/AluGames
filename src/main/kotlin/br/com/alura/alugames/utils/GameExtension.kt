package br.com.alura.alugames.utils

import br.com.alura.alugames.modelo.DataGameJson
import br.com.alura.alugames.modelo.Game

fun DataGameJson.createGame(): Game {
    return Game(this.titulo, this.capa, this.preco, this.descricao)
}