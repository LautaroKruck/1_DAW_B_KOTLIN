class Ordenador (nombre: String, precio: Double, val tipoOrdenador: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio) {

    fun promocionNavidad(DescuentoNavidad: Double = 30.0) {
        if (precio > 500.00) {
            precio -= (precio * DescuentoNavidad/100)
        }
    }
}