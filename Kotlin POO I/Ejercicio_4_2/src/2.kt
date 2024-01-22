fun main() {

    var persona1: PersonaEjer2(90.55, 1.93)
    val persona2: PersonaEjer2("Marta", 61.88, 1.69)
    val persona2: PersonaEjer2(nombre: "David", altura = 1.65, peso = 69.50)

    persona1.nombre = "Diego"

    persona1.mostrarDesc()

    persona1.peso = 70.00
}

