class Estudiante(nombre: String, edad: Int, val carrera: String) : Persona(nombre, edad ) {
    override fun toString(): String {
        return super.toString().dropLast(2).replace("Persona", "Estudiante") + ", carrera = $carrera )"
    }
    override fun actividad(): String {
        return "$nombre está estudiando para un examen"
    }
}
