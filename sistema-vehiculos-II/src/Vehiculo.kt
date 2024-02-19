open class Vehiculo(
    val nombre: String,
    val marca: String,
    val modelo: String,
    val capacidadCombustible: Float,
    var combustibleActual: Float,
    var kilometros: Int = 0)
{
    init{
        require(capacidadCombustible > 0)
        require(combustibleActual >= 0 )

    }


    open fun obtenerInformacion(): String {
        return "Cantidad de kilometros con combustible actual: ${combustibleActual * 10} km"
    }

    open fun realizaViaje(distancia: Float): String {
        val autonomia = calcularAutonomia()
        if (distancia < autonomia) {
            combustibleActual -= distancia/10
            kilometros += distancia.toInt()
            return "Se han recorrido $distancia km"
        }
        else  if (distancia == autonomia.toFloat()) {
            combustibleActual = 0.0F
            kilometros += distancia.toInt()
            return "Se han recorrido $distancia km"
        }
        else {
            val distanciaPosible = autonomia
            combustibleActual = 0.0F
            return "Se han recorrido $distanciaPosible km"
        }
    }

    open fun repostar(cantidad: Float = 0f): String {
        val cantidadARepostar = capacidadCombustible - combustibleActual
        if (cantidad > cantidadARepostar) {
            combustibleActual = capacidadCombustible
            return "Se han repostado $cantidadARepostar litros"
        }
        else  if (cantidad <= 0) {
            combustibleActual = capacidadCombustible
            return "Se han repostado $cantidadARepostar litros"
        }
        else {
            combustibleActual += cantidad
            return "Se han repostado $cantidad litros"
        }
    }

    open fun calcularAutonomia(): Int {
        val autonomia = combustibleActual * 10
        return autonomia.toInt()
    }

    override fun toString(): String {
        return "El vehiculo de marca $marca, modelo $modelo, Capacidad de combustible: ${"%2f".format(capacidadCombustible)} l, Cantidad de combustible: ${"%2f".format(capacidadCombustible)} l, Kilometros recorridos: $kilometros km"
    }
}