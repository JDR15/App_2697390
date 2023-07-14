package com.JDR15.app_2697390

class Condicionales {
}

fun main() {

    /*println("Ingrese el primer numero")
    var n1 : Int = readLine()!!.toInt()
    println("Ingrese el segundo numero")
    var n2 : Int = readLine()!!.toInt()

    if (n1>n2){
        println("El numero mayor es el primero: $n1")
    }
    else if (n1==n2){
        println("Los numeros son iguales")
    }
    else{
        println("El numero mayor es el segundo: $n2")
    }*/

    //var ramdon = (1 .. 20).random()//

    /*println("Ingrese un numero del 1 al 20")
    var n1 : Int = readLine()!!.toInt()

    if (n1 in 1..20){
        println("El numero esta dentro del rango")
    }
    else{
        println("Te dije un numero del 1 al 20 ")
    }*/

    /*var ram = (0 .. 50).random()

    when(ram){
        0 -> println("No hay concidencias")
        in 1..10 -> println("Hay 10 coincidencias")
        in 20 ..50 -> println("Hay muchas coincidencias")
    }*/

    //RETO 1//

    /* var n1 = (1 .. 6).random()
    var n2 = (1 .. 6).random()


    if(n1==1 && n2==1){
        println("Ganaste con par de unos")
    }
    else if(n1+n2==3){
        println("Ganaste con tres en los dados")
    }
    else if(n1+n2==11){
        println("Ganaste con once en los dados")
    }
    else if(n1+n2==2 || n1+n2==12){
        println("Ganaste con dos o con doce")
    }
    else if(n1+n2==7){
        println("Ganaste con siete en los dados ")
    }
    else{
        println("Perdiste")
    }*/

    //RETO 2//

    var n = (0 .. 4).random()

    println("Ingresa el valor de tu compra: ")
    var buy : Int = readLine()!!.toInt()

    if (buy>50000 && n==1){
        var r: Float = 0.10F
       var d1 = buy*r
        var t1 = buy-d1
        println("Sacaste la bolita roja tu compra tiene un descuento de: $d1 su total a pagar es: $t1")
    }
    else if (buy>50000 && n==2){
        var a : Float = 0.30F
        var d2 = buy*a
        var t2= buy-d2
        println("Sacaste la bolita azul tu compra tiene un descuento de: $d2 su total a pagar es: $t2")
    }
    else if (buy>50000 && n==3){
        var am : Float = 0.50F
        var d3= buy*am
        var t3= buy-d3
        println("Sacaste la bolita amarilla tu compra tiene un descuento de: $d3 su total a pagar es: $t3")
    }
    else if(buy>50000 && n==4){
        println("Sacaste la bolita blanca tu compra es gratis")
    }
    else{
        println("No sacaste ninguna bolita por lo tanto no tienes ningun descuento")
    }


}