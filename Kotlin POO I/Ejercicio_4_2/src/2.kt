fun main() {

    val persona1: Persona(peso:90.55, altura: 1.93)
    val persona2: Persona("Marta", 61.88, 1.69)
    val persona2: Persona(nombre: "David", altura = 1.65, peso = 69.50)

    persona1.nombre = "Diego"

    persona1.mostrarDesc()

    persona1.peso = 70.00
}

class Persona () {
    var peso: Double = 0.0
        get() = field
        set(value) {
            require(value > 0) { "El peso no puede ser negativo. "}
            field = value
        }
    var altura: Double = 0.0
        get() = field
        set(value) {
            require(value > 0) { "La altura no puede ser negativa. " }
            field = value
        }
    var nombre: String = ""
        get() = field
        set(value) {
            require(value.trim().isNotEmpty()) { "El nombre no puede estar vacío." }
            field = value
        }
    var imc: Any = 0.0
        get() = obtenerImc()
        private set(value) {
            field = value
        }
    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura) {
        this.nombre = nombre
    }
    fun obtenerImc(): String {
        return "%.2f".format(this.peso / (this.altura * this.altura))
    }
    fun mostrarDesc() {
        println("${this.nombre} con peso ${this.peso} KG y altura ${this.altura} m teien un IMC de ${obtenerImc()}" )
    }
}
