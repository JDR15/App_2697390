package com.JDR15.app_2697390

class Ciclos {
}

fun main() {

    /*for (i in 1 .. 5) print(i)
    println()
    for (i in 5 downTo 0) print(i)
    println()
    for (i in 1 ..10 step 2) print(i)
    println()
    for (i in 'a'..'e') print(i)*/

    /*for (i in 1 .. 10){
      var n: Int = i%2
      if ( n==0){
          println("Par")
      }
      else {
          println("Impar")
      }
    }*/


    /*var c = 0
    var a = 0

        for (r in 1 .. 10) {
            println("Ingrese 10 numeros")
            var n: Int = readLine()!!.toInt()
            var r: Int = n % 2

            if (r == 0) {
                c++
            } else if ( r ==1){
                a++
            }
        }
    println("Cantidad numeros pares: $c cantidad numeros impares: $a")*/

    /*var c = 0
    var a = 0

    for (r in 1 .. 10) {
        println("Ingrese 10 numeros")
        var n: Int = readLine()!!.toInt()
        var r: Int = n % 2

        if (r == 0) {
            c = n + n
        } else if ( r ==1){
            a = n + n
        }
    }
    println("La suma de los numeros pares es: $c la suma de los numeros impares es: $a")*/

    /*var c: Int = 0
    var a: Int = 0

    for (r in 1 .. 3) {
        println("Ingrese 10 numeros")
        var n: Int = readLine()!!.toInt()
        var r: Int = n % 2

        if (n <= 0) {
            break
        }else if(r==0){
            c += n
        }
        else{
            a += n
        }
    }
    println("La suma de los numeros pares es: $c la suma de los numeros impares es: $a")*/


    //CICLO WHILE//

    /*var op: Int = 1
    var c: Int = 0
    var a: Int = 0

    while (op==1) {

        println("Ingrese 10 numeros")
        var n: Int = readLine()!!.toInt()
        var r: Int = n % 2

        if (n <= 0) {
            break
        }else if(r==0){
            c += n
        }
        else{
            a += n
        }

        println("Desea ingresar otro numero 1.Si 2.No")
        op= readLine()!!.toInt()

    }

    println("La suma de los numeros pares es: $c la suma de los numeros impares es: $a")*/


    var op: Int = 1
    var c: Int = 0
    var a: Int = 0

    do{
        println("Ingrese 10 numeros")
        var n: Int = readLine()!!.toInt()
        var r: Int = n % 2

        if (n <= 0) {
            break
        }else if(r==0){
            c += n
        }
        else{
            a += n
        }

        println("Desea ingresar otro numero 1.Si 2.No")
        op= readLine()!!.toInt()

    }while (op==1)

    println("La suma de los numeros pares es: $c la suma de los numeros impares es: $a")
}