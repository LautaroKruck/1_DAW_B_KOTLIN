open class Persona(val nombre: String, var edad: Int) {
    var edad: Int = edad
        set(value) {
            requireEdad()
            field = value
        }
    init {
        require(nombre.isNotBlank()) {"El nombre no puede estar vacío"}
    }
    fun cumple(){
        edad ++
        println("$nombre tiene un año más ")
    }
    private fun requireEdad() {
        require(edad >= 0) {"La eda no puede ser negativa"}
    }
    open fun actividad(): String {
        return "$nombre está realizando una actividad"
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad )"
    }
}

class Estudiante(nombre: String, edad: Int, val carrera: String) : Persona(nombre, edad ) {
    override fun toString(): String {
        return super.toString().dropLast(2).replace("Persona", "Estudiante") + ", carrera = $carrera )"
    }
    override fun actividad(): String {
        return "$nombre está estudiando para un examen"
    }
}

fun main() {
    val yo = Persona("lautaro", 18)
    println(yo)
    yo.cumple()
    println(yo)
    yo.actividad()

    val es = Estudiante("Pablo", 21, "Medicina" )

    println(es)
    es.cumple()
    println(es)
    print(es.actividad())
}