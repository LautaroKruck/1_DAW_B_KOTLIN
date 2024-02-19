
class Motocicleta(val marca: String, val modelo: String, val capacidadCombustible: Float, val cilindrada: Int) : Vehiculo(marca, modelo, capacidadCombustible) {

    companion object{
        const val KM_POR_LITRO = 20
        const val KM_POR_CABALLITO = 5.0f
    }

    fun realizaCaballito(): Float {
        val autonomia = calcularAutonomia()
        if (KM_POR_CABALLITO < autonomia) {
            combustibleActual -= 5/20
            kilometros += KM_POR_CABALLITO.toInt()
            return combustibleActual
        }
        else  if (KM_POR_CABALLITO == autonomia.toFloat()) {
            combustibleActual = 0.0F
            kilometros += KM_POR_CABALLITO.toInt()
            return combustibleActual
        }
        else {
            println("No es posible hacer caballito")
            return combustibleActual
        }
    }

    override fun obtenerInformacion(): String {
        return "Cantidad de kilometros con combustible actual: ${combustibleActual * KM_POR_LITRO} km"
    }

    override fun calcularAutonomia(): Int {
        return capacidadCombustible * KM_POR_LITRO
    }
    override fun toString(): String {
        return "La motocicleta de marca $marca, modelo $modelo, capacidad de $capacidadCombustible litros y de cilindrada $cilindrada"
    }
}