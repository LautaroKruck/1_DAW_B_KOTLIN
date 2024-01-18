
fun main (args: Array<String>){

    val miArray = mutableListOf(1, 2, 3, 4, 5)

    miArray[0] = 33

    miArray.add(99)

    for(num in miArray){
        println(num)
    }

    miArray.forEach{ println(it) }

    for (indice in miArray.indices)  {
        miArray[indice]++
    }

    for (i in 0 ..4){
        println(miArray[i])
    }

    for (i in miArray.size -1 downTo 0 step 2){
        println(miArray[i])
    }

    for (i in (0..miArray.size -1).reversed() step 2){
        println(miArray[i])
    }

    for ((indice,valor) in miArray.withIndex()){
        println("$indice -> $valor")
    }

    var i = 0
    do {
        println("$i -> ${miArray[i]}")
        i++
    } while (i < miArray.size)





}
