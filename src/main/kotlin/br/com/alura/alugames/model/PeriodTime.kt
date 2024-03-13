package br.com.alura.alugames.model

import java.time.LocalDate
import java.time.Period

data class PeriodTime(
    val initDate: LocalDate,
    val endDate: LocalDate
) {
    val qtdDays = Period.between(initDate, endDate).days

}
