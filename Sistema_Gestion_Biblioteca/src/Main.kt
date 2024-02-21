fun main() {
    val libro = Libro("La historia interminable", "Michael Ende", 1979)
    val estudiante = Usuario.Estudiante("123", "Juan", "Literatura")
    val profesor = Usuario.Profesor("456", "Ana", "Filosofía")
    val visitante = Usuario.Visitante("789", "Pedro")

    println(estudiante.puedeTomarPrestado(libro))
    println(profesor.puedeTomarPrestado(libro))
    println(visitante.puedeTomarPrestado(libro))
}