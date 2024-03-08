package br.com.alura.alugames.utils

import br.com.alura.alugames.model.DataGamerJson
import br.com.alura.alugames.modelo.Gamer

fun DataGamerJson.createGamer(): Gamer {
    return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
}