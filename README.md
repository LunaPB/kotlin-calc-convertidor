# Calculadora y Convertidor en Kotlin

## 1. Descripción
Mini aplicación de consola que funciona como un menú de utilidades, permitiendo al usuario acceder a una calculadora de Índice de Masa Corporal (IMC) y a un convertidor de unidades.

## 2. Instrucciones de instalación y ejecución
Este proyecto asume que ya cuentas con el compilador de Kotlin (`kotlinc`) y Java instalados en tu sistema. Para ejecutar el proyecto desde cero, abre tu terminal y sigue estos pasos exactos:

1. Clona el repositorio:
   `git clone https://github.com/LunaPB/kotlin-calc-convertidor.git`

2. Ingresa a la carpeta del proyecto:
   `cd kotlin-calc-convertidor`

3. Compila el código fuente en un archivo ejecutable (.jar):
   `kotlinc src/main/kotlin/Main.kt -include-runtime -d Calculadora.jar`

4. Ejecuta la aplicación:
   `java -jar Calculadora.jar`

## 3. Funcionalidades principales
* **Menú interactivo:** Mantiene la aplicación en ejecución hasta que el usuario decide salir.
* **Calculadora de IMC:** Calcula el Índice de Masa Corporal solicitando peso y altura, y clasifica el resultado (Bajo peso, Normal, Sobrepeso, Obesidad).
* **Convertidor de Unidades:** Sub-menú que permite convertir grados Celsius a Fahrenheit y metros a pies.

## 4. Conceptos de Kotlin aplicados
| Requisito Técnico | Implementación en el código |
| :--- | :--- |
| **Data class** | Se utilizó `data class Herramienta` para modelar las opciones del menú con un ID y un nombre descriptivo. |
| **Colecciones** | Se empleó una `List` (`listOf`) para almacenar las herramientas disponibles y se iteró sobre ellas usando la función de orden superior `forEach`. |
| **Null safety** | Se manejaron las entradas del usuario con `readlnOrNull()?.toDoubleOrNull()` y el operador Elvis (`?:`) para evitar que el programa colapse si se ingresa texto en lugar de números. |
| **Condicionales y ciclos** | Se usó un bucle `while` para mantener vivo el programa y bloques `when` para evaluar las opciones del menú y los rangos lógicos del IMC. |

## 5. Reflexión de proceso
**a) ¿Qué fue lo más difícil de este proyecto y cómo lo resolviste?**
Lo mas complicado fue posiblemente la clasificación del IMC, ya que al inicio lo empezamos a hacer usando una cadena de if/else pero al darnos cuenta de que se estaba volviendo dificil de entender, descubrimos que podiamos usar la sintaxis "in" dentro del "when" para evaluar los rangos lógicos, dejando mas ordenado el código.

**b) ¿Hubo algún concepto de Kotlin que al principio no entendías y que ahora sí comprendes? ¿Cómo llegaste a entenderlo?**
Null Safety es posiblemente el que menos entendiamos de todos los conceptos por la sintaxis específica de Kotlin, ya que conocemos el concepto por otros lenguajes de programación pero terminamos de entender el funcionamiento de los signos de interrogación con testeos durante el desarrollo del programa.

**c) Si tuvieras que mejorar o ampliar este proyecto, ¿qué le agregarías y por qué?**
Le añadiriamos persistencia de datos. Si bien no es esencial para un programa de este estilo, en ciertos casos evitaria que el usuario tenga que volver a teclear la misma información dos veces para consultar el mismo resultado.

**d) ¿Qué aprendiste de este proyecto que no aprendiste solo leyendo o viendo videos?**
Aprendimos a documentar nuestro control de versiones y flujo de trabajo de manera apropiada y ordenada. Si bien sabiamos como subir los cambios que vamos realizando, no siempre lo etiquetabamos de la mejor manera.