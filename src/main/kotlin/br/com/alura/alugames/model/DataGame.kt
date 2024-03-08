package br.com.alura.alugames.model

data class DataGame(val info: DataApiShark) {
    override fun toString(): String {
        return info.toString()
    }
}
