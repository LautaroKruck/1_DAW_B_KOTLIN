class Habitacion (val ancho: Int, val alto: Int) {
    var tablero: Array<Array<Char>> = Array(alto) { Array(ancho) { ' ' } } // Espacio vacío inicializado como '0'

    var posicionX = 1 // Inicializar la posición X
    var posicionY = 1 // Inicializar la posición Y

    init {

        // Colocar el contorno
        for (x in 0 until ancho) {
            tablero[0][x] = '1'
            tablero[alto - 1][x] = '1'
        }
        for (y in 0 until alto) {
            tablero[y][0] = '1'
            tablero[y][ancho - 1] = '1'
        }

        // Colocar obstáculos
        tablero[2][2] = 'X'
        tablero[2][3] = 'X'
        tablero[3][5] = 'X'
        tablero[5][7] = 'X'
        tablero[7][3] = 'X'
        tablero[6][6] = 'X'
        tablero[8][1] = 'X'

        // Colocar puertas

        tablero[1][9] = 'P' // Puerta en la parte superior derecha
        tablero[8][0] = 'P' // Puerta en la parte inferior izquierda
        tablero[8][9] = 'P' // Puerta en la parte inferior derecha
        tablero[5][0] = 'P' // Puerta en el lado izquierdo
        }


    fun imprimirTablero() {
        for (fila in tablero) {
            println(fila.joinToString(" "))
        }
    }


    // Métodos moverIzquierda, moverDerecha, moverArriba, moverAbajo, dibujarTablero
    // ... (Igual que antes, pero ten en cuenta el ajuste de índices)


    fun moverIzquierda(): Pair<Pair<Int, Int>, Pair<Int, Int>> {
        val posAnterior = Pair(posicionX, posicionY)
        if (posicionX > 0 && tablero[posicionY][posicionX - 1] != 'O') {
            posicionX--
        }
        return posAnterior to Pair(posicionX, posicionY)
    }

    fun moverDerecha(): Pair<Pair<Int, Int>, Pair<Int, Int>> {
        val posAnterior = Pair(posicionX, posicionY)
        if (posicionX < ancho - 2 && tablero[posicionY][posicionX + 1] != 'O' && tablero[posicionY][posicionX + 2] != 'O') {
            posicionX += 1
        }
        return posAnterior to Pair(posicionX, posicionY)
    }

    fun moverArriba(): Pair<Pair<Int, Int>, Pair<Int, Int>> {
        val posAnterior = Pair(posicionX, posicionY)
        if (posicionY > 0 && tablero[posicionY - 1][posicionX] != 'O') {
            posicionY--
        }
        return posAnterior to Pair(posicionX, posicionY)
    }

    fun moverAbajo(): Pair<Pair<Int, Int>, Pair<Int, Int>> {
        val posAnterior = Pair(posicionX, posicionY)
        if (posicionY < alto - 1 && tablero[posicionY + 1][posicionX] != 'O') {
            posicionY++
        }
        return posAnterior to Pair(posicionX, posicionY)
    }

    fun dibujarTablero() {
        for (y in 0 until alto) {
            for (x in 0 until ancho) {
                if (x == posicionX && y == posicionY) {
                    print('0') // Representa la posición actual del objeto
                } else {
                    print(tablero[y][x])
                }
            }
            println()
        }
    }


    fun miraArriba(): Char {
        return if (posicionY > 0) tablero[posicionY - 1][posicionX] else ' '
    }

    fun miraAbajo(): Char {
        return if (posicionY < alto - 1) tablero[posicionY + 1][posicionX] else ' '
    }

    fun miraIzquierda(): Char {
        return if (posicionX > 0) tablero[posicionY][posicionX - 1] else ' '
    }

    fun miraDerecha(): Char {
        return if (posicionX < ancho - 1) tablero[posicionY][posicionX + 1] else ' '
    }
}

    fun main() {
        val habitacion = Habitacion(10, 10)
        habitacion.dibujarTablero() // Dibuja el tablero inicial

        // Realizar movimientos y volver a dibujar el tablero después de cada uno
        // Ejemplo de movimiento
        println("Moviendo a la derecha: ${habitacion.moverDerecha()}")
        habitacion.dibujarTablero()
    }

