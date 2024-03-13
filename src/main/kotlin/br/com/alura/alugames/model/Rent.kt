package br.com.alura.alugames.model

data class Rent(val gamer: Gamer, val game: Game, val period: PeriodTime) {
    val rentValue = game.price * period.qtdDays

    override fun toString(): String {
        return "Aluguel do jogo ${game.titulo} por ${gamer.nome} pelo valor R$$rentValue"
    }
}
