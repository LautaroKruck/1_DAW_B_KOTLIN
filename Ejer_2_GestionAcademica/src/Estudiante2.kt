class Estudiante2(var nombre: String, var edad: Int, var curso: String, var calificacion: Double): Persona2(nombre, edad) {
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Id: $id"
        return super.toString() + ",Curso: $curso, Calificacion promedio: $calificacion"
    }
    override fun mostrarRol() {
        return "Soy un Estudiante"
    }
}
