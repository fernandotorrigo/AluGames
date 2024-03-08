package br.com.alura.alugames.modelo

data class Game(
    val titulo: String, val capa: String
) {
    var descricao: String? = null
    var preco = 0.0

    constructor(titulo: String, capa: String, preco: Double, descricao: String) : this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
    }

    override fun toString(): String {
        return "Meu Jogo: \n" + "Título: $titulo \n" + "Capa: $capa \n" + "Descricao: $descricao" + "Preço: $preco"
    }
}