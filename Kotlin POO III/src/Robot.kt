class Robot(private val nombre: String) {
    var posX = 0
    var posY = 0
    var direccion = Direccion.POSITIVEY

    init {
        if (nombre.trim().isEmpty()) {
            throw IllegalArgumentException("El nombre no puede estar vacío.")
        }
    }

    fun mover(movimientos: List<Int>) {
        for (movimiento in movimientos) {
            when (direccion) {
                Direccion.POSITIVEY -> posY += movimiento
                Direccion.NEGATIVEY -> posY -= movimiento
                Direccion.POSITIVEX -> posX += movimiento
                Direccion.NEGATIVEX -> posX -= movimiento
            }
        }
        girar90Grados()
    }

    private fun girar90Grados() {
        direccion = when (direccion) {
            Direccion.POSITIVEY -> Direccion.POSITIVEX
            Direccion.NEGATIVEY -> Direccion.NEGATIVEX
            Direccion.POSITIVEX -> Direccion.NEGATIVEY
            Direccion.NEGATIVEX -> Direccion.POSITIVEY
        }
    }

    fun obtenerDireccion(): String {
        return direccion.name
    }

    fun mostrarPosicion() {
        println("$nombre está en ($posX, $posY) ${obtenerDireccion()}.")
    }
}
