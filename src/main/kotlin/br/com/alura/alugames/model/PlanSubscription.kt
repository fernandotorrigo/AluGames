package br.com.alura.alugames.model

class PlanSubscription(
    tipo: String,
    val mesalidade: Double,
    val jogosIncluidos: Int,
    val percentualDescontoReputacao: Double
) : Plan(tipo) {

    override fun getValue(rent: Rent): Double {
        val totalJogosNoMes = rent.gamer.jogosDoMes(rent.periodTime.initDate.monthValue).size + 1

        return if (totalJogosNoMes <= jogosIncluidos) {
            0.0
        } else {
            var valorOriginal = super.getValue(rent)
            if (rent.gamer.media > 8) {
                valorOriginal -= valorOriginal * percentualDescontoReputacao
            }
            valorOriginal
        }

    }
}