package br.senai.sp.jandira.listadeviagem.utils

import java.time.LocalDate

fun encurtartarData(data: LocalDate): String {



    return "${data.dayOfMonth}  ${data.month.toString().substring(0,3).toLowerCase()}"
}