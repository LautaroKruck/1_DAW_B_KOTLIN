open class Persona(val nombre: String, edad: Int) {
    var edad: Int = edad
        set(value) {
            require(value >= 0) { "La edad no puede ser negativa" }
            field = value
        }

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        this.edad = edad
    }

    fun cumple() {
        edad++
        println("$nombre tiene un año más")
    }

    open fun actividad(): String {
        return "$nombre está realizando una actividad"
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
}

