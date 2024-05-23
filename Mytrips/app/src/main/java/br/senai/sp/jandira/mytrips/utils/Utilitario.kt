package br.senai.sp.jandira.mytrips.utils

import android.bluetooth.BluetoothHidDeviceAppQosSettings
import java.time.LocalDate
import kotlin.math.tan

fun encurtartarData(data: String): String {

    if (
        data.substring(3,4).toLowerCase() == "01"||
        data.substring(3,4).toLowerCase() == "02"||
        data.substring(3,4).toLowerCase() == "03"||
        data.substring(3,4).toLowerCase() == "04"||
        data.substring(3,4).toLowerCase() == "05"||
        data.substring(3,4).toLowerCase() == "06"||
        data.substring(3,4).toLowerCase() == "07"||
        data.substring(3,4).toLowerCase() == "08"||
        data.substring(3,4).toLowerCase() == "09"||
        data.substring(3,4).toLowerCase() == "10"||
        data.substring(3,4).toLowerCase() == "11"||
        data.substring(3,4).toLowerCase() == "12"
        ){

    }
    if (
        data.substring(5,6).toLowerCase() == "01"||
        data.substring(5,6).toLowerCase() == "02"||
        data.substring(5,6).toLowerCase() == "03"||
        data.substring(5,6).toLowerCase() == "04"||
        data.substring(5,6).toLowerCase() == "05"||
        data.substring(5,6).toLowerCase() == "06"||
        data.substring(5,6).toLowerCase() == "07"||
        data.substring(5,6).toLowerCase() == "08"||
        data.substring(5,6).toLowerCase() == "09"||
        data.substring(5,6).toLowerCase() == "10"||
        data.substring(5,6).toLowerCase() == "11"||
        data.substring(5,6).toLowerCase() == "12"
        ){

    }
    if (
        data.substring(3,4).toLowerCase() == "01"||
        data.substring(3,4).toLowerCase() == "02"||
        data.substring(3,4).toLowerCase() == "03"||
        data.substring(3,4).toLowerCase() == "04"||
        data.substring(3,4).toLowerCase() == "05"||
        data.substring(3,4).toLowerCase() == "06"||
        data.substring(3,4).toLowerCase() == "07"||
        data.substring(3,4).toLowerCase() == "08"||
        data.substring(3,4).toLowerCase() == "09"||
        data.substring(3,4).toLowerCase() == "10"||
        data.substring(3,4).toLowerCase() == "11"||
        data.substring(3,4).toLowerCase() == "12"

        ){

    }
    return "  ${data.substring(0,3).toLowerCase()}"
}

fun verificarTelefone(telefone: String): Boolean{
    var telefoneResposta = false
    if (
            telefone.substring(0) != "("||
            telefone.substring(4) != ")"||
            telefone.substring(10) != ")"
        ){
        telefoneResposta = true
    }

    return telefoneResposta
}

//fun tratarData(data: String): String{
//
//    var dataTratada: String = ""
//
//    if (data.monthValue == 1 || data.month.toString().toUpperCase() == "JANUARY"){
//        dataTratada = "Dia ${data.dayOfMonth} de Janeiro de ${data.year}"
//    }
//    if (data.monthValue == 2 || data.month.toString().toUpperCase() == "FEBRUARY"){
//        dataTratada = "Dia ${data.dayOfMonth} de Fevereiro de ${data.year}"
//    }
//    if (data.monthValue == 3 || data.month.toString().toUpperCase() == "MARCH"){
//        dataTratada = "Dia ${data.dayOfMonth} de Março de ${data.year}"
//    }
//    if (data.monthValue == 4 || data.month.toString().toUpperCase() == "APRIL"){
//        dataTratada = "Dia ${data.dayOfMonth} de Abril de ${data.year}"
//    }
//    if (data.monthValue == 5 || data.month.toString().toUpperCase() == "MAY"){
//        dataTratada = "Dia ${data.dayOfMonth} de Maio de ${data.year}"
//    }
//    if (data.monthValue == 6 || data.month.toString().toUpperCase() == "JUNE"){
//        dataTratada = "Dia ${data.dayOfMonth} de Junho de ${data.year}"
//    }
//    if (data.monthValue == 7 || data.month.toString().toUpperCase() == "JULY"){
//        dataTratada = "Dia ${data.dayOfMonth} de Julho de ${data.year}"
//    }
//    if (data.monthValue == 8 || data.month.toString().toUpperCase() == "AUGUST"){
//        dataTratada = "Dia ${data.dayOfMonth} de Agosto de ${data.year}"
//    }
//    if (data.monthValue == 9 || data.month.toString().toUpperCase() == "SEPTEMBER"){
//        dataTratada = "Dia ${data.dayOfMonth} de Setembro de ${data.year}"
//    }
//    if (data.monthValue == 10 || data.month.toString().toUpperCase() == "OCTOBER"){
//        dataTratada = "Dia ${data.dayOfMonth} de Outubro de ${data.year}"
//    }
//    if (data.monthValue == 11 || data.month.toString().toUpperCase() == "NOVEMBER"){
//        dataTratada = "Dia ${data.dayOfMonth} de Novembro de ${data.year}"
//    }
//    if (data.monthValue == 12 || data.month.toString().toUpperCase() == "DECEMBER"){
//        dataTratada = "Dia ${data.dayOfMonth} de Dezembro de ${data.year}"
//    }
//
//    return dataTratada
//}