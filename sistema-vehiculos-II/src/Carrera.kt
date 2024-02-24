import kotlin.random.Random

class Carrera(
    val nombreCarrera: String,
    var participantes: List<Vehiculo>,
    var estadoCarrera: Boolean = false,
    var historialAcciones: MutableMap<String, MutableList<String>> = mutableMapOf(),
    var posiciones: MutableList<Pair<String, Int>> = mutableListOf()
) {
    // Define la distancia total de la carrera de manera aleatoria entre 1000 y 2000
    val distanciaTotal = Random.nextInt(1000, 2000).toFloat()

    init {
        // Inicializa el historial de acciones y las posiciones iniciales de los participantes
        participantes.forEach { vehiculo ->
            historialAcciones[vehiculo.nombre] = mutableListOf("Inicio de la carrera")
            posiciones.add(Pair(vehiculo.nombre, 0))
        }
    }

    companion object {
        // Constante que define los kilómetros a avanzar por tramo
        const val KM_AVANZAR = 20F
    }

    // Método para iniciar la carrera
    fun iniciarCarrera() {
        estadoCarrera = true
        println("La carrera $nombreCarrera ha comenzado!")

        while (estadoCarrera) {
            val vehiculo = participantes.random()
            avanzarVehiculo(vehiculo)
            actualizarPosiciones()
        }

        println("La carrera $nombreCarrera ha finalizado.")
        obtenerResultados()
    }

    // Método para avanzar un vehículo una distancia aleatoria
    fun avanzarVehiculo(vehiculo: Vehiculo) {
        val distancia = Random.nextInt(10, 200).toFloat()

        val tramos = (distancia / KM_AVANZAR).toInt()
        val resto = distancia % KM_AVANZAR

        avanzarTramo(vehiculo, tramos)

        vehiculo.realizaViaje(resto)
        vehiculo.kilometrosActuales += resto
    }

    // Método para avanzar un vehículo por tramos definidos
    fun avanzarTramo(vehiculo: Vehiculo, tramos: Int) {
        repeat(tramos) {
            if (vehiculo.combustibleActual == 0f)
                repostarVehiculo(vehiculo, vehiculo.capacidadCombustible)
            vehiculo.realizaViaje(KM_AVANZAR)
            realizarFiligrana(vehiculo)
        }
    }

    // Método para repostar el vehículo seleccionado
    fun repostarVehiculo(vehiculo: Vehiculo, cantidad: Float) {
        val litros = vehiculo.repostar(cantidad)
        historialAcciones[vehiculo.nombre]?.add("Repostó $litros litros")
    }

    // Método para realizar filigranas de forma aleatoria
    private fun realizarFiligrana(vehiculo: Vehiculo) {
        when (vehiculo) {
            is Automovil -> {
                vehiculo.realizaDerrape()
                historialAcciones[vehiculo.nombre]?.add("Realizó un derrape")
            }
            is Motocicleta -> {
                vehiculo.realizaCaballito()
                historialAcciones[vehiculo.nombre]?.add("Realizó un caballito")
            }
        }
    }

    // Método para actualizar las posiciones de los vehículos basado en la distancia recorrida
    fun actualizarPosiciones() {
        val nuevasPosiciones = participantes.sortedByDescending { it.kilometrosActuales }
            .mapIndexed { index, vehiculo -> vehiculo.nombre to index + 1 }.toMutableList()

        posiciones.clear()
        posiciones.addAll(nuevasPosiciones)
    }

    // Método para determinar si hay un ganador de la carrera
    fun determinarGanador(): Boolean {
        participantes.forEach { vehiculo ->
            if (vehiculo.kilometrosActuales >= distanciaTotal) {
                estadoCarrera = false
                println("El vehículo ganador es ${vehiculo.nombre} con ${vehiculo.kilometrosActuales} kilómetros recorridos.")
                return true
            }
        }
        return false
    }

    // Método para obtener y mostrar los resultados finales de la carrera
    fun obtenerResultados() {
        val clasificados = participantes.sortedByDescending { it.kilometrosActuales }

        println("Resultados finales de la carrera $nombreCarrera:")
        clasificados.forEachIndexed { index, vehiculo ->
            println("${index + 1}. ${vehiculo.nombre}: ${vehiculo.kilometrosActuales} km")
            historialAcciones[vehiculo.nombre]?.let { acciones ->
                println("Acciones de ${vehiculo.nombre}:")
                acciones.forEach { accion ->
                    println("- $accion")
                }
            }
        }
    }
}
