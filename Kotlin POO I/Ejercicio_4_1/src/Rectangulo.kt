class Rectangulo () {

    var base: Double = 0.0
        get() = field
        set(value) {
            require(value > 0) { "La base no puede ser negativa. "}
            field = value
        }
    var altura: Double = 0.0
        get() = field
        set(value) {
            require(value > 0) { "La altura no puede ser negativa. "}
            field = value
        }
    var area: Any = 0.0
        get() = calcArea()
        private set(value) {
            field = value
        }
    var perimetro: Any = 0.0
        get() = calcPerim()
        private set(value) {
            field = value
        }

    constructor(base: Double, altura: Double) : this() {
        this.base = base
        this.altura = altura
    }

    fun calcArea(): Double = (this.base * this.altura)
    fun calcPerim(): Double = (this.base * 2 + this.altura * 2)

    fun mostrar() {
        println("El rectangulo con base ${this.base} y altura ${this.altura} tiene un area de ${calcArea()} y un perimetro de ${calcPerim()}")
    }

}