
fun main() {
    // Ejemplo de movimientos
    val movimientos = listOf(
        listOf(10, 5, -2),
        listOf(0, 0, 0),
        emptyList(),
        listOf(-10, -5, 2),
        listOf(-10, -5, 2, 4, -8)
    )

    // Crear objeto Robot
    val robot1 = Robot(nombre = "R2D2")

    // Iterar sobre los movimientos y mostrar la posición después de cada uno
    for (movimiento in movimientos) {
        robot1.mover(movimiento)
        robot1.mostrarPosicion()
    }
}

