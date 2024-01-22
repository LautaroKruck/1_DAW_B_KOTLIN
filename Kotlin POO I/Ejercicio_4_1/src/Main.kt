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

