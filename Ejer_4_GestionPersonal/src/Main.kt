fun main() {
    val persona = Persona("Julia", 24)
    println(persona)
    println(persona.celebrarCumple())

    val empleado = Empleado("Pablo", 30, 30000.0)
    println(empleado)
    println(empleado.trabajar())

    val gerente = Gerente("Ana", 40, 50000.0, bonus = 10000.0, exentoImpuestos = true)
    println(gerente)
    println(gerente.administrar())
}
