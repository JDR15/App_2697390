package com.JDR15.app_2697390

class Introduccion {
}

fun  main(){
    //println("Hola mundo")//

    /*var v1 : Long = 1234567878
    println(v1)
    var v2 : Int = 1243457656
    println(v2)
    var v3 : Short = 1000
    println(v3)
    var v4 : Byte = 100
    println(v4)
    var v5 : Double = 1.567879
    println(v5)
    var v6 : Float = 1.7F
    println(v6)
    var v7 : Char = 'Q'
    println(v7)
    var v8 : Boolean = true
    println(v8)*/


    println("Ingresa tu nombre")
    var name = readLine()
    println("Ingresa tu apellido")
    var lastName = readLine()
    println("Ingresa tu edad")
    var age : Int = readLine()!!.toInt() + 10

    println("En 10 años ${name} ${lastName} tendra ${age} años")

}


/*var name1 = "Johan"

var name2 : String = "Johan"*/


