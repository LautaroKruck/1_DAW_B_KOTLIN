open class Articulo(var nombre: String, var precio: Double ) {
    private val id = generarId()
    companion object {
        private var idCont = 0
        private fun generarId() = ++idCont
    }
    /*
    private val id = ++idCont
    companion object {  private var idCont = 0  }
     */
    open fun promocionNavidad(DescuentoNavidad: Double = 30.0){
         precio -= (precio * DescuentoNavidad/100)
    }

    override fun toString(): String {
        return "$nombre --> ${"%.2f".format(precio)}€ (ID: {${"%.2f".format(id)}})"
    }
}