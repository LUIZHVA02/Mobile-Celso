fun main() {
    println("Qual será o valor multiplicador?")
    var multiplicador = readln().toInt()
    println("Qual é o menor valor multiplicado?")
    var menorValor = readln().toInt()
    println("Qual é o maior valor multiplicado?")
    var maiorValor = readln().toInt()

    var valorA = menorValor
    var valorB = maiorValor

    if (maiorValor<menorValor){
        valorA = maiorValor
        valorB = menorValor
    }

    for (multiplicando in valorA..valorB){
        println("$multiplicador X $multiplicando = ${multiplicador * multiplicando}")
    }
}