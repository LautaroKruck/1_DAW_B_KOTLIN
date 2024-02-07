import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class HabitacionTest {

    @Test
    fun moverIzquierda() {
        val habitacion = Habitacion(10, 10)
        habitacion.dibujarTablero()
        assertEquals('1', habitacion.miraIzquierda())
    }

    @Test
    fun moverDerecha() {
        val habitacion = Habitacion(10,10)

        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        assertEquals('1', habitacion.miraDerecha())
    }

    @Test
    fun moverArriba() {
        val habitacion = Habitacion(10, 10)
        habitacion.moverDerecha()
        habitacion.moverIzquierda()
        assertEquals('1', habitacion.miraArriba())
    }

    @Test
    fun moverAbajo() {
        val habitacion = Habitacion(10, 10)
        habitacion.moverAbajo()
        habitacion.moverAbajo()
        habitacion.moverAbajo()
        habitacion.moverAbajo()
        habitacion.moverAbajo()
        habitacion.moverAbajo()

        assertEquals('X', habitacion.miraAbajo())
    }

    @Test
    fun miraArriba() {
        val habitacion = Habitacion(10, 10)
        habitacion.moverAbajo()
        habitacion.moverAbajo()
        habitacion.moverDerecha()
        assertEquals('X', habitacion.miraArriba())
    }

    @Test
    fun miraAbajo() {
        val habitacion = Habitacion(10, 10)
        habitacion.moverDerecha()
        assertEquals('X', habitacion.miraAbajo())
    }

    @Test
    fun miraIzquierda() {
        val habitacion = Habitacion(10, 10)
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverAbajo()
        assertEquals('X', habitacion.miraIzquierda())
    }

    @Test
    fun miraDerecha() {
        val habitacion = Habitacion(10, 10)
        habitacion.moverAbajo()
        assertEquals('X', habitacion.miraDerecha())
    }

    @Test
    fun comprobarPuerta() {
        val habitacion = Habitacion(10, 10)
        assertEquals(true, habitacion.encontrarCaminoHastaPuerta())
    }
}