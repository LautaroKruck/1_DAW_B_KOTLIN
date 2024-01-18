/*
Ejercicio 4.1¶
1. Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

2. Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

3. En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
*/
fun main() {
    val rectangulo1 = Rectangulo(2.2,4.0)
    val rectangulo2 = Rectangulo(3.7,8.0)
    val rectangulo3 = Rectangulo(1.0,2.0)
    val rectangulo4 = Rectangulo(6.0,3.0)

    rectangulo1.mostrar()
    rectangulo2.mostrar()
    rectangulo3.mostrar()
    rectangulo4.mostrar()
}

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



