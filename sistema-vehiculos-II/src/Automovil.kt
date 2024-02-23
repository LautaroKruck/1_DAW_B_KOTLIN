class Automovil(
    nombre: String,
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    kilometrosActuales: Float,
    val esHibrido: Boolean
) : Vehiculo(nombre, marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales)
{
    companion object {
        var condicionBritanica = false
        var kilometrosActuales: Float = 0f

        public fun cambiarCondicionBritanica(nuevaCondicion: Boolean)
        {
            condicionBritanica = nuevaCondicion
        }
    }
    override fun calcularAutonomia(): Float
    {
        val bonusHibrido = if (esHibrido) 5 else 0
        return (combustibleActual * (KM_POR_LITRO + bonusHibrido))
    }

    fun realizaDerrape(): Float
    {
        val gastoDerrape = if (esHibrido) 6.25f else 7.5f
        combustibleActual -= gastoDerrape / KM_POR_LITRO
        return combustibleActual
    }

    override fun toString(): String
    {
        return "El automovil de marca $marca, modelo $modelo, capacidad de $capacidadCombustible litros, cantidad de $combustibleActual litros, hibrido: $esHibrido, ha recorrido $kilometrosActuales km"
    }
}

