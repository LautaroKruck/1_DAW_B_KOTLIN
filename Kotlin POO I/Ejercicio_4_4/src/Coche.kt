class Coche(
    marca: String,
    modelo: String,
    private var color: String?,
    private var numCaballos: Int,
    private var numPuertas: Int,
    private var matricula: String
) {
    private val marca: String = marca
        get() = field?.firstCharUpperCase()

    private val modelo: String = modelo
        get() = field?.firstCharUpperCase()

    init {
        require(marca.isNotBlank() && modelo.isNotBlank()) { "Marca y modelo no pueden ser blancos ni nulos" }
        require(color != null) { "Color no puede ser nulo" }
        require(numCaballos in 70..700) { "Número de caballos debe estar entre 70 y 700" }
        require(numPuertas in 3..5) { "Número de puertas debe estar entre 3 y 5" }
        require(matricula.length == 7) { "La matrícula debe tener 7 caracteres" }
    }

    fun getColor(): String? {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getNumCaballos(): Int {
        return numCaballos
    }

    // Setter personalizado para numCaballos
    fun setNumCaballos(nuevoNumCaballos: Int) {
        require(nuevoNumCaballos in 70..700) { "Número de caballos debe estar entre 70 y 700" }
        // Si la validación es exitosa, se actualiza el valor
        numCaballos = nuevoNumCaballos
    }

    fun getNumPuertas(): Int {
        return numPuertas
    }

    // Setter personalizado para numPuertas
    fun setNumPuertas(nuevoNumPuertas: Int) {
        require(nuevoNumPuertas in 3..5) { "Número de puertas debe estar entre 3 y 5" }
        // Si la validación es exitosa, se actualiza el valor
        numPuertas = nuevoNumPuertas
    }

    fun getMatricula(): String {
        return matricula
    }

    // Setter personalizado para matricula
    fun setMatricula(nuevaMatricula: String) {
        require(nuevaMatricula.length == 7) { "La matrícula debe tener 7 caracteres" }
        // Si la validación es exitosa, se actualiza el valor
        matricula = nuevaMatricula
    }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', color=$color, numCaballos=$numCaballos, numPuertas=$numPuertas, matricula='$matricula')"
    }
}
