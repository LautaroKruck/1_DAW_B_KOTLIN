class Automovil(
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    val esHibrido: Boolean
) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual) {
    companion object {
        var condicionBritanica = false

        fun cambiarCondicionBritanica(nuevaCondicion: Boolean) {
            condicionBritanica = nuevaCondicion
        }
    }

    override fun calcularAutonomia(): Float {
        val bonusHibrido = if (esHibrido) 5 else 0
        return (combustibleActual * (KM_POR_LITRO + bonusHibrido))
    }

    fun realizaDerrape(): Float {
        val gastoDerrape = if (esHibrido) 6.25f else 7.5f
        combustibleActual -= gastoDerrape / KM_POR_LITRO
        return combustibleActual
    }
}

