open class Vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int ){

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }

    override fun toString(): String {
        return "El vehiculo de marca $marca, modelo $modelo y capacidad de $capacidadCombustible"
    }
}