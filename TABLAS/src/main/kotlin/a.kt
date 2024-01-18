fun main(args: Array<String>)
{
    println("Introduzca una frase")
    val frase = readln()
    val listapalabras = frase.split( ' ')

    var palabraMayor = ""
    var cont = 0
    var total = 0

    listapalabras.forEach{ palabra ->
        if (palabra.length > palabraMayor.length)
        {
            palabraMayor = palabra
            cont = 1
        }
        else if (palabra.length == palabraMayor.length)
        {
            cont ++
        }
    total ++
     }

    for (palabra in listapalabras) {
        if (palabra.length >palabraMayor.length)
        {palabraMayor = palabra
            cont = 1
        }
        else if (palabra.length == palabraMayor.length)
        {
            cont ++
        }
    }
    println("La palabra mayor es $palabraMayor y aparecen ${listapalabras.size} palabras. ")
}