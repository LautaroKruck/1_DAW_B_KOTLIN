import kotlin.random.Random

class Carrera(
    val nombreCarrera: String,
    var participantes: List<Vehiculo>,
    val distanciaTotal: Float
) {
    var historialAcciones: MutableMap<String, MutableList<String>> = mutableMapOf()
    var paradasRepostaje: MutableMap<String, Int> = mutableMapOf()

    init {
        participantes.forEach { vehiculo ->
            historialAcciones[vehiculo.nombre] = mutableListOf("Inicio de la carrera")
            paradasRepostaje[vehiculo.nombre] = 0
        }
    }

    fun iniciarCarrera() {
        println("La carrera $nombreCarrera ha comenzado!")

        while (!participantes.any { it.kilometrosActuales >= distanciaTotal }) {
            val vehiculo = participantes.random()
            avanzarVehiculo(vehiculo)
        }

        println("La carrera $nombreCarrera ha finalizado.")
        println("")
        mostrarGanador()
        mostrarResultadosFinales(obtenerResultados())
    }

    private fun mostrarGanador() {
        val ganador = participantes.maxByOrNull { it.kilometrosActuales }
        ganador?.let {
            println("Ha ganado ${ganador.nombre} con ${ganador.kilometrosActuales} kilómetros recorridos.\n")
        }
    }

    private fun avanzarVehiculo(vehiculo: Vehiculo) {
        // Implementación simplificada, deberías ajustar según tu lógica
        val distancia = Random.nextInt(10, 200).toFloat()
        vehiculo.kilometrosActuales += distancia
        registrarAccion(vehiculo.nombre, "Avanzó $distancia km")
    }

    private fun registrarAccion(vehiculoNombre: String, accion: String) {
        historialAcciones.getOrPut(vehiculoNombre) { mutableListOf() }.add(accion)
    }

    fun obtenerResultados(): List<ResultadoCarrera> {
        return participantes.sortedByDescending { it.kilometrosActuales }
            .map { vehiculo ->
                ResultadoCarrera(
                    vehiculo = vehiculo,
                    kilometraje = vehiculo.kilometrosActuales,
                    paradasRepostaje = paradasRepostaje[vehiculo.nombre] ?: 0,
                    historialAcciones = historialAcciones[vehiculo.nombre] ?: mutableListOf()
                )
            }
    }

    private fun mostrarResultadosFinales(resultados: List<ResultadoCarrera>) {


        resultados.forEach { resultado ->
            println("Vehículo: ${resultado.vehiculo.nombre}")
            println("Kilometraje: ${resultado.kilometraje}")
            println("Acciones: ${resultado.historialAcciones.joinToString(", ")}")
            println()
        }
    }
}
