package br.senai.sp.jandira.aulaKotlin

import kotlin.math.pow

fun main() {
    var preco: Double

    println("Olá mundo!")
    println("qual é a sua idade?")
    var idade = readln().toInt()
    println("Qual é o seu nome?")
    var nome = readln()
    println("Quantas vezes você quer imprimir?")
    var printNum = readln().toInt()
    var setMaioridade = "maior"

    if (idade >= 18) {
        setMaioridade = "maior"
    }
    if (idade < 18){
        setMaioridade = "menor"
    }
    var num = 0
    while (num != printNum) {
        println("${num+1} Meu nome é $nome, tenho $idade anos. Sou $setMaioridade de idade")
    num++
    }
println("")
    for(n in -10..10){
        println("$n Meu nome é $nome, tenho $idade anos. Sou $setMaioridade de idade")
    }
}