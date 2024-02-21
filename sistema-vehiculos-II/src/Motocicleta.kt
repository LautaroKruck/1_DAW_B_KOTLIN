class Motocicleta(
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    val cilindrada: Int
) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual) {
    companion object {
        const val KM_POR_LITRO_BASE = 20f
        var kilometrosActuales: Float = 0f
    }

    override fun calcularAutonomia(): Float {
        val ajustePorCilindrada = 1f - (cilindrada / 1000f)
        return combustibleActual * (KM_POR_LITRO_BASE + (ajustePorCilindrada * KM_POR_LITRO_BASE))
    }

    fun realizaCaballito(): Float {
        val gastoPorCaballito = 6.5f
        combustibleActual -= gastoPorCaballito / KM_POR_LITRO_BASE
        return combustibleActual
    }

    override fun toString(): String {
        return "La motocicleta de marca $marca, modelo $modelo, capacidad de $capacidadCombustible litros, cantidad de $combustibleActual litros y cilindrada $cilindrada, ha recorrido $kilometrosActuales km"
    }
}
