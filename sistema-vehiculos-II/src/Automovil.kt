
class Automovil(val marca: String, val modelo: String, val capacidadCombustible: Int, val combustbleActual: Int, val electrico: Boolean = false, val conBrit: Boolean = false) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual) {


    fun esElectrico(): Boolean {
        return electrico
    }

    fun condicionBritania(): Boolean {
        return conBrit
    }

    fun realizaDerrape(): Float {

    }

    override fun obtenerInformacion(): String {
        return "Cantidad de kilometros con combustible actual: ${combustibleActual * 10} km"
    }

    override fun calcularAutonomia(): Int {
        return if (electrico)
            (combustibleActual * 5).toInt()
        else
            (combustibleActual * 10).toInt()
    }
    override fun toString(): String {
        return "El automovil de marca $marca, modelo $modelo y capacidad de $capacidadCombustible litros"
    }
}