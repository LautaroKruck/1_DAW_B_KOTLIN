
class Motocicleta(val marca: String, val modelo: String, val capacidadCombustible: Int, val cilindrada: Int) : Vehiculo(marca, modelo, capacidadCombustible) {
    override fun calcularAutonomia(): Int {
        return capacidadCombustible * 40
    }
    override fun toString(): String {
        return "La motocicleta de marca $marca, modelo $modelo, capacidad de $capacidadCombustible litros y de cilindrada $cilindrada"
    }
}