import kotlin.math.ln
import kotlin.random.Random

class Carrera (
    val nombreCarrera: String,
    var distanciaTotal: Int,
    var participantes: List<Vehiculo>,
    var estadoCarrera: Boolean,
    var historialAcciones: MutableMap<String, MutableList<String>>,
    var posiciones: MutableList<Pair<String, Int>>
){
    //Inicia la carrera, estableciendo estadoCarrera a true y comenzando el ciclo de iteraciones donde los vehículos avanzan y realizan acciones.
    fun iniciarCarrera(){
        estadoCarrera = true
        distanciaTotal = Random.nextInt(1000,2000)

        while(determinarGanador() != true){
            val vehiculo = participantes.random()


        }
    }

     //Identificado el vehículo, le hace avanzar una distancia aleatoria entre 10 y 200 km. Si el vehículo necesita repostar, se llama al método repostarVehiculo() antes de que pueda continuar. Este método llama a realizar filigranas.
    fun avanzarVehiculo(vehiculo: Vehiculo) {

         val distancia = Random.nextInt(10,200)
         var tramos = distancia / 20
         val resto = distancia % 20
         while (tramos > 0) {
             if (vehiculo.combustibleActual == 0f)
                 repostarVehiculo(vehiculo, cantidad = vehiculo.capacidadCombustible)
             vehiculo.realizaViaje(20f)
             realizarFiligrana(vehiculo)
         }
         vehiculo.realizaViaje(resto.toFloat())
         this.kilometrosActual  es += distancia

    }

    //Reposta el vehículo seleccionado, incrementando su combustibleActual y registrando la acción en historialAcciones.
    fun repostarVehiculo(vehiculo: Vehiculo, cantidad: Float){
            vehiculo.repostar(cantidad)
    }

    //Determina aleatoriamente si un vehículo realiza una filigrana (derrape o caballito) y registra la acción.
    fun realizarFiligrana(vehiculo: Vehiculo) {
        repeat(Random.nextInt(0,2)){
            when{
                vehiculo is Automovil -> vehiculo.realizaDerrape()
                vehiculo is Motocicleta -> vehiculo.realizaCaballito()
            }
        }
    }

    //Actualiza posiciones con los kilómetros recorridos por cada vehículo después de cada iteración, manteniendo un seguimiento de la competencia.
    fun actualizarPosiciones() {
        for (vehiculo in participantes) {
            if (Vehiculo.kilometrosActuales < distanciaTotal) {return false}
            else {return true}
        }
    }

    //Revisa posiciones para identificar al vehículo (o vehículos) que haya alcanzado o superado la distanciaTotal, estableciendo el estado de la carrera a finalizado y determinando el ganador.
    fun determinarGanador(): Boolean {
        for (vehiculo in participantes) {
            if (Vehiculo.kilometrosActuales < distanciaTotal) {return false}
            else {return true}
        }
    }


    fun obtenerResultados() {

    }
}