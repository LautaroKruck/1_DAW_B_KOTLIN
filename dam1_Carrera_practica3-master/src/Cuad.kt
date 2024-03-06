
class Cuad(
    nombre: String,
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    kilometrosActuales: Float,
    val cilindrada: Int
) : Motocicleta( nombre, marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales, cilindrada )
{

    companion object {
        const val KM_POR_LITRO = 20.0f // 20 KM por litro.
    }

    override fun calcularAutonomia() = (combustibleActual * (KM_POR_LITRO - (1 - (cilindrada/1000)))).redondear(2)

    override fun toString(): String {
        return "Motocicleta(nombre=$nombre, marca=$marca, modelo=$modelo, capacidadCombustible=$capacidadCombustible, combustibleActual=$combustibleActual, kilometrosActuales=$kilometrosActuales, cilindrada=$cilindrada)"
    }
}