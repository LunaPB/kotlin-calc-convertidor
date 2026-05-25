// Data Class
data class Herramienta(val id: Int, val nombre: String)

fun main() {
    // Colecciones
    val herramientas = listOf(
        Herramienta(1, "Calculadora de IMC"),
        Herramienta(2, "Convertidor de Unidades"),
        Herramienta(3, "Salir")
    )

    var ejecutando = true

    while (ejecutando) {
        println("\n--- MENÚ PRINCIPAL ---")

        herramientas.forEach { println("${it.id}. ${it.nombre}") }

        print("Selecciona una opción: ")

        // Null Safety
        val opcion = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> println("\n[ Iniciando Calculadora de IMC... ]")
            2 -> println("\n[ Iniciando Convertidor de Unidades... ]")
            3 -> {
                println("Saliendo del programa. ¡Hasta luego!")
                ejecutando = false
            }
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    }
}