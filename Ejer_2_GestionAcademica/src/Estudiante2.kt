
class Estudiante2(nombre: String, edad: Int, private var curso: String, private var calificacion: Double): Persona2(nombre, edad) {
    override fun toString(): String {

        return super.toString() + ", Curso: $curso, Calificación promedio: $calificacion"
    }

    override fun mostrarRol() {
        println("Soy un Estudiante")
    }
}
