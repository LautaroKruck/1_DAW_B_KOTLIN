open class Base(var p: Int) {
    open fun incrementar(num: Int ) {
        p += num
    }
}

class Derivada(p: Int, var msj: String) : Base(p) {
    override fun incrementar(num: Int) {
        // p += (num * 2)
        // super.incrementar(num * 2)
        // ES LO MISMO
        p += (num * 2)
    }
}


fun main() {
    val d = Derivada(10, "ESTO ES UN MENSAJE")

    d.incrementar(5)

    println("${d.p}, ${d.msj}")
}