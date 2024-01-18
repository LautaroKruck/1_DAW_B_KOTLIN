

fun pedirNum(min: Int, max: Int): Int {
    var num: Int
    val salir = false
    while (!salir) {
        try {
            print("Introduce un número entre $min y $max: ")
            num = readln()
            if (num in min..max) {
                break
            } else {
                println("Número no válido. Debe estar en el rango especificado.")
            }
        } catch (e: InputMismatchException) {
            println("Error en entrada. Debes introducir un número entero.")
        }
    }
    return num
}

fun pregunta(text: String): Boolean
{
        print("$text (s/n): ")
        val respuesta = readln().ToLowerCase()
        when (respuesta)
        {
            "s","si" -> return true
            "n","no" -> return false
            else -> println("Error en respuesta. Debes contestar con 's','si' o 'n','no'.")
        }
}

fun main() {
    do {
        val num = pedirNum(1, 100)
        val tabla = Array(11) { i -> (i + 1) * num }

        println("Tabla de multiplicar del $num:")
        for (i in tabla.indices) println("$num x ${i + 1} = ${tabla[i]}")

    } while (pregunta("¿Desea generar otra tabla de multiplicación?"))
}
