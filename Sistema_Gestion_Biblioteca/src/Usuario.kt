
sealed class Usuario {
    abstract val id: String
    abstract val nombre: String

    data class Estudiante(override val id: String, override val nombre: String, val carrera: String) : Usuario()

    data class Profesor(override val id: String, override val nombre: String, val departamento: String) : Usuario()

    data class Visitante(override val id: String, override val nombre: String) : Usuario()

    fun puedeTomarPrestado(libro: Libro): String {
        return when (this) {
            is Estudiante -> "El estudiante $nombre puede tomar prestado el libro ${libro.titulo}."
            is Profesor -> "El profesor $nombre puede tomar prestado el libro ${libro.titulo} por un tiempo extendido."
            is Visitante -> "El visitante $nombre no puede tomar prestado el libro ${libro.titulo}."
        }
    }
}

