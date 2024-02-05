open class Persona2(val nombre: String, var edad: Int) {
    protected val id = ++ idCont
    companion object {
        var idCont = 0
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Id: $id"
    }
    open fun mostrarRol() {
        println("Soy una Persona")
    }
}