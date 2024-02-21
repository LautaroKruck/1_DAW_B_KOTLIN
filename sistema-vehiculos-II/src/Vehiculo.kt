open class Vehiculo(
    val marca: String,
    val modelo: String,
    val capacidadCombustible: Float,
    var combustibleActual: Float
) {
    var kilometrosActuales: Float = 0f

    companion object {
        const val KM_POR_LITRO = 10f
    }

    open fun obtenerInformacion(): String = "Con el combustible actual, el vehículo puede recorrer ${calcularAutonomia()} km."

    open fun calcularAutonomia(): Float = combustibleActual * KM_POR_LITRO

    open fun realizaViaje(distancia: Float): Float {
        val distanciaMaxima = calcularAutonomia()
        if (distancia <= distanciaMaxima) {
            combustibleActual -= distancia / KM_POR_LITRO
            kilometrosActuales += distancia
            return 0f
        } else {
            combustibleActual = 0f
            kilometrosActuales += distanciaMaxima
            return distancia - distanciaMaxima
        }
    }

    open fun repostar(cantidad: Float): Float {
        val cantidadARepostar = if (cantidad <= 0) capacidadCombustible - combustibleActual else minOf(cantidad, capacidadCombustible - combustibleActual)
        combustibleActual += cantidadARepostar
        return cantidadARepostar
    }
}
