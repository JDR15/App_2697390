package com.JDR15.app_2697390

class Array {
}



    /*val myList = mutableListOf("trumpet", "piano", "violin")
    println(myList)

    // Obtener el primer elemento
   val primerElemento = myList.first()

    // Obtener el último elemento
    val ultimoElemento = myList.last()

    println("Primer elemento: $primerElemento")
    println("Último elemento: $ultimoElemento")

    // Agregar elementos a una lista mutable

    myList.add("Guitar")

    println(myList)

    // Eliminar un elemento específico de la lista

    myList.remove("piano")

    println(myList)

    // Eliminar un elemento por su índice

    myList.removeAt(2)  // Eliminar el elemento en el índice 2 (valor 3)

    println(myList)


    // Borrar la lista completa

    myList.clear()

    println(myList)*/


    /*val auto = mutableListOf<String>("Ferrari")

    println("Digite el auto")
    var registrar: String = readLine()!!.toString()
    auto.add(registrar)

    if (){
        println("Auto ya existente")


    println(auto)*/

//RETO 3

data class Auto(var marca: String, var modelo: String, var año: Int)

fun main() {
    val listaAutos = mutableListOf<Auto>()

    var e: Int = 1

    do {

        println("1. Registrar auto")
        println("2. Mostrar listado de autos")
        println("3. Buscar auto")
        println("4. Modificar auto")
        println("5. Eliminar auto")
        println("6. Borrar lista de autos")

        var  op = readLine()!!.toInt()

        when (op) {
            1 -> {

                print("Ingresa la marca del auto: ")
                val marca = readLine()!!.toString()
                print("Ingresa el modelo del auto: ")
                val modelo = readLine()!!.toString()
                print("Ingresa el año del auto: ")
                val año = readLine()!!.toInt()


                if (año < 0) {
                    println("El año del auto no puede ser negativo.")
                } else {

                    if (listaAutos.any { it.marca == marca && it.modelo == modelo && it.año == año }) {
                        println("Este auto ya ha sido registrado previamente.")
                    } else {
                        val nuevoAuto = Auto(marca, modelo, año)
                        listaAutos.add(nuevoAuto)
                        println("Auto registrado correctamente.")
                    }
                }
            }
            2 -> {

                if (listaAutos.isEmpty()) {
                    println("La lista de autos está vacía.")
                } else {
                    println("Listado de autos:")
                    listaAutos.forEachIndexed { index, auto ->
                        println("${index + 1}. Marca: ${auto.marca}, Modelo: ${auto.modelo}, Año: ${auto.año}")
                    }
                }
            }
            3 -> {

                print("Ingresa la marca del auto a buscar: ")
                val marcaBuscar = readLine()!!.toString()
                print("Ingresa el modelo del auto a buscar: ")
                val modeloBuscar = readLine()!!.toString()

                val autosEncontrados = listaAutos.filter { it.marca == marcaBuscar && it.modelo == modeloBuscar }

                if (autosEncontrados.isNotEmpty()) {
                    println("Autos encontrados:")
                    autosEncontrados.forEach { auto ->
                        println("Marca: ${auto.marca}, Modelo: ${auto.modelo}, Año: ${auto.año}")
                    }
                } else {
                    println("No se encontraron autos con la marca '$marcaBuscar' y modelo '$modeloBuscar'.")
                }
            }
            4 -> {

                print("Ingresa la marca del auto a modificar: ")
                val marcaModificar = readLine()!!.toString()
                print("Ingresa el modelo del auto a modificar: ")
                val modeloModificar = readLine()!!.toString()
                print("Ingresa el año del auto a modificar: ")
                val añoModificar = readLine()!!.toInt()


                val autoEncontrado = listaAutos.find { it.marca == marcaModificar && it.modelo == modeloModificar && it.año == añoModificar }

                if (autoEncontrado != null) {
                    print("Ingresa la nueva marca del auto: ")
                    val nuevaMarca =readLine()!!.toString()
                    print("Ingresa el nuevo modelo del auto: ")
                    val nuevoModelo = readLine()!!.toString()
                    print("Ingresa el nuevo año del auto: ")
                    val nuevoAño = readLine()!!.toInt()


                    if (nuevoAño < 0) {
                        println("El año del auto no puede ser negativo.")
                    } else {

                        if (listaAutos.any { it != autoEncontrado && it.marca == nuevaMarca && it.modelo == nuevoModelo && it.año == nuevoAño }) {
                            println("Ya existe otro auto con la misma marca, modelo y año.")
                        } else {

                            autoEncontrado.marca = nuevaMarca
                            autoEncontrado.modelo = nuevoModelo
                            autoEncontrado.año = nuevoAño
                            println("Auto modificado correctamente.")
                        }
                    }
                } else {
                    println("No se encontró el auto para modificar.")
                }
            }
            5 -> {

                print("Ingresa la marca del auto a eliminar: ")
                val marcaEliminar = readLine()!!.toString()
                print("Ingresa el modelo del auto a eliminar: ")
                val modeloEliminar = readLine()!!.toString()
                print("Ingresa el año del auto a eliminar: ")
                val añoEliminar = readLine()!!.toInt()


                val autoEncontrado = listaAutos.find { it.marca == marcaEliminar && it.modelo == modeloEliminar && it.año == añoEliminar }

                if (autoEncontrado != null) {
                    listaAutos.remove(autoEncontrado)
                    println("Auto eliminado correctamente.")
                } else {
                    println("No se encontró el auto para eliminar.")
                }
            }
            6 -> {

                listaAutos.clear()
                println("Lista de autos borrada correctamente.")
            }
            7 -> {
                println("Saliendo del programa.")
            }
            else -> {
                println("Opción inválida, por favor ingresa una opción válida (1-7).")
            }
        }


        println("Desea volver a digitar 1.Si 2.No")
        e= readLine()!!.toInt()

    } while (e==1)
}



