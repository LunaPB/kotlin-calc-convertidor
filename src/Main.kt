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
            // Mandamos a llamar a la función de cada programa
            1 -> ejecutarCalculadoraIMC()

            2 -> println("\n[ Iniciando Convertidor de Unidades... ]")

            3 -> {
                println("Saliendo del programa. ¡Hasta luego!")
                ejecutando = false
            }
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    }
}
fun ejecutarCalculadoraIMC() {
    println("\n[ Iniciando Calculadora de IMC ]")
    print("Ingresa tu peso en kilogramos (ej. 70.5): ")
    val peso = readlnOrNull()?.toDoubleOrNull()

    print("Ingresa tu altura en metros (ej. 1.75): ")
    val altura = readlnOrNull()?.toDoubleOrNull()

    // Verificación de variables: que no sean nulas y la altura sea válida
    if (peso != null && altura != null && altura > 0.0) {
        val imc = peso / (altura * altura)
        // Redondeamos el resultado numérico a 2 decimales
        val imcFormateado = String.format("%.2f", imc)

        print("Tu IMC es $imcFormateado. Clasificación: ")

        // Uso de when sin argumento para evaluar rangos lógicos
        when {
            imc < 18.5 -> println("Bajo peso")
            imc in 18.5..24.9 -> println("Peso normal")
            imc in 25.0..29.9 -> println("Sobrepeso")
            else -> println("Obesidad")
        }
    } else {
        println("Error: Valores inválidos. Asegúrate de usar números positivos.")
    }
}