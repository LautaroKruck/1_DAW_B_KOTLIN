fun main() {
    // Instancia de varios coches
    val coche1 = Coche("Toyota", "Corolla", "Rojo", 150, 4, "1234567")
    val coche2 = Coche("Honda", "Civic", "Azul", 100, 5, "7654321")

    // Mostrar coches por pantalla
    println(coche1)
    println(coche2)

    // Intentar modificar valores con condiciones incorrectas
    // Modificar número de caballos a un valor inferior a 70
    try {
        coche1.setColor("Verde")
        coche1.setNumCaballos(50) // Esto debería lanzar una excepción
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    // Modificar número de puertas a un valor superior a 5
    try {
        coche1.setNumPuertas(6) // Esto debería lanzar una excepción
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    // Modificar matrícula con un valor que no tiene 7 caracteres
    try {
        coche1.setMatricula("AB12345") // Esto debería lanzar una excepción
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    // Intentar instanciar o modificar con valores nulos/blancos
    try {
        // Intentar instanciar con marca nula
        val coche3 = Coche("", "Focus", "Blanco", 120, 4, "ABC1234") // Esto debería lanzar una excepción
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    // Intentar modificar con color nulo (ahora se permite porque color es String?)
    try {
        coche1.setColor(null) // Esto debería ejecutarse sin problemas
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
