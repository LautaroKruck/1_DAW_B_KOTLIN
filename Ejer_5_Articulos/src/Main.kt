
fun main() {
    val articulo1 = Articulo("Teclado", 25.00)
    val articulo2 = Articulo("Raton", 45.00)
    val ordenador1 = Ordenador("MSI 8020", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("HP Office", 399.99)

    val articulos = listOf(articulo1, articulo2)
    val articuloos = listOf(ordenador1, ordenador2)

    articulos.forEach { articulo ->
        articulo.promocionNavidad()
        println(articulo)
    }

    articuloos.forEach { articulo ->
        articulo.promocionNavidad()
        println(articulo)
    }

}