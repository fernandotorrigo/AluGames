package br.com.alura.alugames.model

data class Game(
    val titulo: String,
    val capa: String
) : Recomendable {
    var description: String? = null
    var price = 0.0

    private val listaNotas = mutableListOf<Int>()
    override val media: Double
        get() = listaNotas.average()

    override fun recomend(nota: Int) {
        listaNotas.add(nota)
    }

    constructor(titulo: String, capa: String, price: Double, description: String) :
            this(titulo, capa) {
        this.price = price
        this.description = description
    }

    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $description \n" +
                "Preço: $price" +
                "Reputação: $media"
    }
}
