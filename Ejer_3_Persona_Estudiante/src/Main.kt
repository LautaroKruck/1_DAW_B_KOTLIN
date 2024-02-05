fun main() {
    val yo = Persona("lautaro", 18)
    println(yo)
    yo.cumple()
    println(yo)
    println(yo.actividad())

    val es = Estudiante("Pablo", 21, "Medicina" )

    println(es)
    es.cumple()
    println(es)
    println(es.actividad())
}