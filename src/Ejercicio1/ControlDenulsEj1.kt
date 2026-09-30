package Ejercicio1

fun printeo(texto: String?): String {
println(texto ?: "No has puesto nada")
    return texto ?: "No has puesto nada."
}



fun main() {
        printeo("Hello World!")
    }
