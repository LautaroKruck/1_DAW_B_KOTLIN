class Taza(val color: String = "Blanco", val capacidad: Int = 50) {
    var cantidad = 0
        set(value) {
            field = if (value > capacidad) capacidad else value
        }

    fun llenar() {
        cantidad = capacidad
    }

    fun llenar(cantidad: Int) {
        this.cantidad = cantidad
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}
