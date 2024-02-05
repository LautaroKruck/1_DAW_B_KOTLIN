open class Empleado(nombre: String, edad: Int, var salarioBase: Double, var porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {
    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuestos: Int = 10) : this(nombre, edad, salarioBase.toDouble(), porcentajeImpuestos.toDouble())

    open fun calcularSalario(): Double {
        return salarioBase * (1 - porcentajeImpuestos / 100)
    }

    override fun toString(): String {
        return super.toString() + ", Salario: ${"%.2f".format(calcularSalario())}€"
    }

    fun trabajar(): String {
        return "$nombre está trabajando en la empresa."
    }
}

