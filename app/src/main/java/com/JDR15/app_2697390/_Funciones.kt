package com.JDR15.app_2697390

class Funciones {
}

fun main() {

    //Funcion por expresion

    /*val temperature = 20
    val isHot = if (temperature > 40) true else false

    println(isHot)*/

    /*println("Ingrese su edad ")

    val age = readLine()!!.toInt()

    val enter= if (age > 18) println("Bienvenido") else println("Pa la casa")*/


    fun calcularPerimetroCirculo() {

        println("Ingrese el radio")
        var r = readLine()!!.toInt()

        var per = 2 * Math.PI * r

        println("El perimetro del circulo es $per ")
    }

    fun calcularAreaCirculo() {
        println("Ingrese el radio")
        var r: Double = readLine()!!.toDouble()
        var ar = Math.PI * Math.pow(r, 2.0)
        println("El area del circulo es $ar ")
    }

    fun tipo(l1: Int, l2: Int, l3: Int) {
        if (l1 == l2 && l2 == l3) {
            println("El triangulo es equilatero")
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            println("El triangulo es isósceles")
        } else {
            println("El triangulo es escaleno")
        }
    }

    fun calcpTriangulo(l1: Int, l2: Int, l3: Int) {
        var per = l1 + l2 + l3
        println("El perimetro del triangulo es $per ")

        tipo(l1, l2, l3)
    }

    fun calcaTriangulo(l1: Int, l2: Int, l3: Int) {
        var ar = l1 + l2 + l3 / 2
        println("El area del triangulo es $ar ")
        tipo(l1, l2, l3)
    }

    fun calcpCuadrado(lado: Int): Int {
        return 4 * lado!!
    }

    fun calcaCuadrado(lado: Int): Int {
        return lado * lado!!
    }


    var e: Int = 1

    do {
        println("Escoge una opcion")

        println("1.Calcular perimetro circulo")
        println("2.Calcular area Circulo")
        println("3.Calcular perimetro Triangulo")
        println("4.Calcular area Triangulo")
        println("5.Calcular perimetro Cuadrado")
        println("6.Calcular area Cuadrado")


        var op = readLine()!!.toInt()

        if (op == 1) {
            calcularPerimetroCirculo()
        } else if (op == 2) {
            calcularAreaCirculo()
        } else if (op == 3) {
            println("Ingrese los lados del triangulo")
            calcpTriangulo(
                l1 = readLine()!!.toInt(),
                l2 = readLine()!!.toInt(),
                l3 = readLine()!!.toInt()
            )
        } else if (op == 4) {
            println("Ingrese los lados del triangulo")
            calcaTriangulo(
                l1 = readLine()!!.toInt(),
                l2 = readLine()!!.toInt(),
                l3 = readLine()!!.toInt(),
            )

        } else if (op == 5) {
            println("Ingrese el lado del cuadrado")
            var per = calcpCuadrado(lado = readLine()!!.toInt())
            println("El perimetro del cuadrado es $per")
        } else if (op == 6) {
            println("Ingrese el lado del cuadrado")
            var ar = calcaCuadrado(lado = readLine()!!.toInt())
            println("El perimetro del cuadrado es $ar")
        }

        println("3.Desea volver a digitar 1.Si 2.No")
        e = readLine()!!.toInt()
    } while (e == 1)

}