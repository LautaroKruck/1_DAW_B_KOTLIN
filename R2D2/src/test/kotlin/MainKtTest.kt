import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class R2D2Test {

    @Test
    fun testMoverRobot1() {
        val resultado = moverRobot(intArrayOf(10, 5, -2))
        assertEquals(Triple(-5, 12, "POSITIVEX"), resultado)
    }

    @Test
    fun testMoverRobot2() {
        val resultado = moverRobot(intArrayOf(0, 0, 0))
        assertEquals(Triple(0, 0, "POSITIVEX"), resultado)
    }

    @Test
    fun testMoverRobot3() {
        val resultado = moverRobot(intArrayOf(-10, -5, 2))
        assertEquals(Triple(5, -12, "POSITIVEX"), resultado)
    }

    @Test
    fun testMoverRobot4() {
        val resultado = moverRobot(intArrayOf(-10, -5, 2, 4, -8))
        assertEquals(Triple(9, -20, "NEGATIVEX"), resultado)
    }
}
