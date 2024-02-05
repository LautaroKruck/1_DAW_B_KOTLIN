
class Automovil(val marca: String, val modelo: String, val capacidadCombustible: Int ) : Vehiculo(marca, modelo, capacidadCombustible) {
     override fun calcularAutonomia(): Int {
        return capacidadCombustible * 100
    }
    override fun toString(): String {
        return "El automovil de marca $marca, modelo $modelo y capacidad de $capacidadCombustible litros"
    }
}