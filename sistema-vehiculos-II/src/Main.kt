fun main() {
    val micoche = Automovil("Ferrari", "deportivo", 1000.00, )
    println(micoche)


    val miauto = Automovil("Ford", "familiar", 750)
    println(miauto)
    println(miauto.calcularAutonomia())

    val mimoto = Motocicleta("Honda", "deportiva", 1000, 1000)
    println(mimoto)
    println(mimoto.calcularAutonomia())

}