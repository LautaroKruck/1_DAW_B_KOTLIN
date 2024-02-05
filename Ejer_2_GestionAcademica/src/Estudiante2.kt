
class Estudiante2(var nombre: String, var edad: Int, private var curso: String, private var calificacion: Double): Persona2(nombre, edad) {
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Id: $id"
        return super.toString() + ",Curso: $curso, Calificacion promedio: $calificacion"
    }
    override fun mostrarRol(): String {
        return "Soy un Estudiante"
    }
}
