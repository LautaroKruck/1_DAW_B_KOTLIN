
class Camion(
    nombre: String,
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    kilometrosActuales: Float,
    val peso: Int
) :Automovil(nombre, marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales, esHibrido = false) {

    init {
        require(peso in 1000..1000) { "El peso del camion debe tener entre 1000 y 10000 Kg" }
    }

    companion object {
        const val KM_POR_LITRO_CAMION = 6.25f
        const val CONSUMO_KG = 0.2f
    }

    override fun calcularAutonomia(): Float {
        val reduccionConsumo = (peso / 1000) * CONSUMO_KG
        val consumoAjustado = KM_POR_LITRO_CAMION - reduccionConsumo
        return combustibleActual * consumoAjustado
    }

    override fun toString(): String {
        return "Camion(nombre=$nombre, marca=$marca, modelo=$modelo, capacidadCombustible=$capacidadCombustible, combustibleActual=$combustibleActual, kilometrosActuales=$kilometrosActuales, peso=$peso)"
    }
}
