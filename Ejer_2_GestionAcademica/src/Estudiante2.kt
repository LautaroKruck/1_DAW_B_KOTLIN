@Suppress("UNREACHABLE_CODE")
class Estudiante2(private var nombre: String, private var edad: Int, private var curso: String, private var calificacion: Double): Persona2(nombre, edad) {
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Id: $id"
        return super.toString() + ",Curso: $curso, Calificacion promedio: $calificacion"
    }
    override fun mostrarRol() {
        return "Soy un Estudiante"
    }
}
