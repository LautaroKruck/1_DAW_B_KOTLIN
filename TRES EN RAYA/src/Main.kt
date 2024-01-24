fun main() {
    val tablero = Array(3) { Array(3) { ' ' } }
    var jugadorActual = 'X'

    imprimirTablero(tablero)

    var i = 0
    while (i < 9) {
        println("Turno del jugador $jugadorActual")
        println("Ingrese la fila (0-2): ")
        val fila = readLine()?.toIntOrNull()

        println("Ingrese la columna (0-2): ")
        val columna = readLine()?.toIntOrNull()

        if (fila != null && columna != null && fila in 0..2 && columna in 0..2 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual
            imprimirTablero(tablero)

            if (comprobarGanador(tablero, jugadorActual)) {
                println("¡El jugador $jugadorActual ha ganado!")
                return
            }

            jugadorActual = if (jugadorActual == 'X') 'O' else 'X'
            i++
        } else {
            println("Movimiento no válido.")
        }
    }

    println("¡Empate!")
}

fun imprimirTablero(tablero: Array<Array<Char>>) {
    println("  0 1 2")
    for (i in tablero.indices) {
        print("$i ")
        for (j in tablero[i].indices) {
            print("${tablero[i][j]} ")
        }
        println()
    }
}

fun comprobarGanador(tablero: Array<Array<Char>>, jugador: Char): Boolean {

    for (i in 0..<3) {
        if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
            (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)
        ) {
            return true
        }
    }

    if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
        (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)
    ) {
        return true
    }

    return false
}
