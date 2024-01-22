fun main() {

    val persona1: Persona(90.55, 1.93)
    val persona2: Persona("Marta", 61.88, 1.69)
    val persona2: Persona(nombre: "David", altura = 1.65, peso = 69.50)

    persona1.nombre = "Diego"

    persona1.mostrarDesc()

    persona1.peso = 70.00
}

