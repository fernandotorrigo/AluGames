package br.com.alura.alugames.model

data class Rent(val gamer: Gamer, val game: Game, val periodTime: PeriodTime) {
    val rentValue = game.price * periodTime.qtdDays

    override fun toString(): String {
        return "Aluguel do jogo ${game.titulo} por ${gamer.nome} pelo valor R$$rentValue"
    }
}
