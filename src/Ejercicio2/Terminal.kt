package Ejercicio2

import java.util.Scanner

class Terminal {
    val scanner = Scanner(System.`in`)

    fun Menu() : Int{
        println("1. Añadir Producto: ")
        println("2. Ver todos los productos")
        println("3. Ver un solo producto")
        println("4. Actualizar Stock")
        println("5. Actualizar Precio")

        return askInt()
    }                                               // * Readln // Para no hacer uso del scanner // Es como el scanner pero en kotlin // Lee segun lo que esperas //
                                                    // Ejemplo: Funcion Menu le pongo return askInt porque ahi espero que el usuario devuelva un numero ( Entero )//

    fun askString() : String{
        return readln()                             // Función para leer strings //
    }

    fun askInt() : Int{
        return readln().toInt()
    }

    fun askFloat() : Float{
        return readln().toFloat()
    }

    fun askCrearProducto() : Producto{

        val id = askInt()
        val preu = askFloat()
        val stock = askInt()
        val categoria = askString()

        return Producto(id, preu, stock, categoria)
    }

    fun askCategoria() : Int{
        println("1. ALIMENTACIO")
        println("2. BEGUDES")
        println("3. NETEJA")
        println("4. FRESCOS")

        return askInt()
    }

    fun mostrarProducto() : Producto{

    }

    fun mostrarUnProducto() : Producto{

    }



}