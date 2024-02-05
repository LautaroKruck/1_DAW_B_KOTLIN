open class Vehiculo(private val marca: String, private val modelo: String, private val capacidadCombustible: Int ){

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }

    override fun toString(): String {
        return "El vehiculo de marca $marca, modelo $modelo y capacidad de $capacidadCombustible litros"
    }
}