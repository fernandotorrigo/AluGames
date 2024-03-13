package br.com.alura.alugames.model

class SeparatedPlan(type: String) : Plan(type) {

    override fun getValue(rent: Rent): Double {
        var valorOriginal = super.getValue(rent)
        if (rent.gamer.media > 8) {
            valorOriginal -= valorOriginal * 0.1
        }
        return valorOriginal
    }
}
