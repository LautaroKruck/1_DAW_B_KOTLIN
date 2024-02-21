class Cafetera(val ubicacion: String ) {



    var capacidad = 1000
        set(value) {
            comprobarCapacidad(value)
            field = value
        }

    var cantidad = 0
        set(value) {
            comprobarCantidad(value)
            field = value
        }

    init {
        comprobarUbicacion(ubicacion)
    }

    constructor(ubicacion: String, capacidad: Int) : this(ubicacion) {
        this.capacidad = capacidad
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion, capacidad) {
        this.cantidad = if (cantidad > capacidad) capacidad else cantidad
    }

    /**
     * Comprueba que la capacidad proporcionada sea válida.
     * @param capacidad La capacidad a comprobar.
     */
    private fun comprobarCapacidad(capacidad: Int) {
        require(capacidad > 0) { "La capacidad debe ser un valor positivo." }
        require(capacidad <= 1000) { "La capacidad no puede exceder 1000 c.c." }
    }

    /**
     * Comprueba que la cantidad proporcionada sea válida.
     * @param cantidad La cantidad a comprobar.
     */
    private fun comprobarCantidad(cantidad: Int) {
        require(cantidad >= 0) { "La cantidad no puede ser negativa." }
        require(cantidad <= capacidad) { "La cantidad no puede exceder la capacidad de la cafetera." }
    }

    /**
     * Comprueba que la ubicación proporcionada sea válida.
     * @param ubicacion La ubicación a comprobar.
     */
    private fun comprobarUbicacion(ubicacion: String) {
        require(ubicacion.trim().isNotEmpty()) { "La ubicación no puede estar vacía." }
    }

    /**
     * Llena la cafetera a su máxima capacidad.
     */
    fun llenar() { this.cantidad = this.capacidad }

    /**
     * Sirve café en una taza, ajustando la cantidad de la taza y de la cafetera.
     * @param taza La taza en la que se sirve el café.
     */
    fun servirTaza(taza: Taza) {
        if (cantidad > 0) {
            val cantidadAServir = minOf(taza.capacidad, cantidad)
            taza.llenar(cantidadAServir)
            cantidad -= cantidadAServir
        }
    }

    /**
     * Vacía la cafetera, estableciendo la cantidad de café en cero.
     */
    fun vaciar() {
        this.cantidad = 0
    }

    /**
     * Agrega una cantidad específica de café a la cafetera.
     * @param cantAgregar Cantidad de café (en c.c.) a agregar.
     */
    fun agregarCafe(cantAgregar: Int = 200) {
        val nuevaCantidad = cantidad + cantAgregar
        cantidad = if (nuevaCantidad > capacidad) capacidad else nuevaCantidad
    }

    /**
     * Retorna una representación en String de la cafetera.
     * @return String que representa la cafetera.
     */
    override fun toString(): String {
        return "Cafetera(Ubicación = ${this.ubicacion}, capacidad = ${this.capacidad} c.c., cantidad = ${this.cantidad} c.c.)"
    }
}
