class Tiempo {
    var hora:Int = hora
        set(value) {

        }
    var minuto:Int = minuto

    var segundo:Int = segundo

    init {
        require(hora)
        require(minuto > 0) {"Minuto no puede ser negativo"}
        require(segundo > 0)  {"Segundo no puede ser negativo"}
    }

    var h = hora
    var m = minuto
    var s = segundo

    if (s > 59) {
        m += s / 60
        s %= 60
    }
    if (m > 59) {
        h += m / 60
        m %= 60
    }

    this.hora = h
    this.minuto = m
    this.segundo = s

    fun incrementar(t: Tiempo):Boolean {
        var h = hora
        var m = minuto
        var s = segundo

        if (s > 59) {
            m += s / 60
            s %= 60
        }
        if (m > 59) {
            h += m / 60
            m %= 60
        }
        if (h > 23 ) {
            return false
        }
        hora = h
        minuto = m
        segundo = s
        return true
    }

    fun decrementar(t: Tiempo):Boolean {
        var h = hora
        var m = minuto
        var s = segundo

        if (s > 59) {
            m -= s / 60
            s %= 60
        }
        if (m > 59) {
            h -= m / 60
            m %= 60
        }
        if (h > 23 ) {
            return false
        }
        hora = h
        minuto = m
        segundo = s
        return true
    }
}