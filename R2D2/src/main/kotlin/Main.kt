/*
¿DÓNDE ESTÁ R2D2?

Calcula dónde estará el robot R2D2 (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y".

El robot siempre comienza en la coordenada (0, 0).
Para indicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos) que indican la secuencia de pasos a dar.
Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene, y finalmente 2 y se detiene. El resultado en este caso sería (x: -5, y: 12)
Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
Los primeros pasos los hace en el eje "y". Interpretamos que inicialmente siempre está mirando hacia la parte positiva del eje "y".
El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos y se detiene, gira 90 grados en el sentido contrario a las agujas del reloj.
En la entrega, adjunta la URL a tu repositorio.

Crea un nuevo proyecto en Intellij Idea que se llame R2D2.
Debes crear una función que reciba los movimientos y retorne el valor de x, y, junto con el texto de la dirección en la que ha quedado R2D2 después de ejecutar los movimientos.
En la función main() se pide que realices las llamadas a la función anterior con los movimientos que se incluyen en el punto 5.
La información que retorna dicha función, que mueve el robot, debe ser mostrada después de su llamada en el propio main():

//TODO: Llamada a la función para mover el robot con los valores 10, -5, -2...
//TODO: Mostrar posición y dirección final del robot...
//TODO: Llamada a la función para mover el robot con los valores 0, 0, 0...
//TODO: Mostrar posición y dirección final del robot...
//...

El programa debe ser capaz de resolver los movimientos siguientes:
[10, 5, -2]
[0, 0, 0]
[]
[-10, -5, 2]
[-10, -5, 2, 4, -8]
Las salidas que el programa debe calcular y mostrar son las siguientes:
x: -5, y: 12, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEY
x: 5, y: -12, direction: POSITIVEX
x: 9, y: -20, direction: NEGATIVEX
*/

fun main() {
    val r2d2Pos1 = moverRobot(intArrayOf(10, 5, -2))
    PosYDir(r2d2Pos1)

    val r2d2Pos2 = moverRobot(intArrayOf(0, 0, 0))
    PosYDir(r2d2Pos2)

    val r2d2Pos3 = moverRobot(intArrayOf(-10, -5, 2))
    PosYDir(r2d2Pos3)

    val r2d2Pos4 = moverRobot(intArrayOf(-10, -5, 2, 4, -8))
    PosYDir(r2d2Pos4)
}

fun moverRobot(movs: IntArray): Triple<Int, Int, String> {
    // Comienza en la posición (0, 0) con la dirección Y positiva
    var posX = 0
    var posY = 0
    var dir = 0     // 0 => POSITIVEY ; 1 => NEGATIVEX ; 2 => NEGATIVEY ; 3 => POSITIVEX

    for (pasos in movs) {
        when (dir) {
            0 -> posY += pasos
            1 -> posX -= pasos
            2 -> posY -= pasos
            3 -> posX += pasos
        }

        // Al finalizar cada movimiento, añado el giro de 90 grados
        if (dir == 3) dir = 0 else dir += 1
    }

    val direccionFinal = obtenerDireccion(dir)
    return Triple(posX, posY, direccionFinal)
}

fun obtenerDireccion(dir: Int): String {
    return when (dir) {
        0 -> "POSITIVEY"
        1 -> "NEGATIVEX"
        2 -> "NEGATIVEY"
        3 -> "POSITIVEX"
        else -> throw IllegalArgumentException("Dirección no válida")
    }
}

fun PosYDir(posicion: Triple<Int, Int, String>) {
    println("x: ${posicion.first}, y: ${posicion.second}, direction: ${posicion.third}")
}