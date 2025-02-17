# Práctica 7.2 Calculadora en JavaFX

## Parte 1
Partiendo del ejercicio anterior crea una **calculadora sencilla** en JavaFX utilizando las operaciones habituales (suma, resta, multiplicación y división) así como un botón de reseteo (C):

- Ayúdate para ello del editor de **Scene Builder** y crea un contenedor *VBox* con tantas filas de *HBox* como filas de botoneras vayas a crear, con espacio entre ellas, así como un 'display' superior.
- Ten en cuenta que la división por cero deberá de mostrar un error.

![](media/2fa660d73bf53b39aeb4ea7aabc963ee.png)

## Parte 2

Mejora la calculadora anterior aplicándole **estilos CSS** para mejorar su apariencia y para que admita la utilización de **decimales** con un botón para ello:

- Agrega estilo y colores mediante *CSS* así como un **icono de aplicación**. Ten en cuenta su **usabilidad/accesibilidad**. 
Se adjunta una captura de ejemplo (no copiar literalmente; usa tu propio estilo basándose en la usabilidad/accesibilidad ya estudiada)

- Agrega un botón para agregar números decimales.

- Deberá de tener también dos botones de **memoria** para almacenar/sumar resultados (*M+*) y otro para borrarlos (*MC*).

- Deberá de tener otro botón para cambiar el **signo** de los operandos en otra fila superior.

> Nota: No olvides generar el fichero *jar* correspondiente para ejecutar la aplicación.


![](media/2023-02-13_14_21_01.png)

## Pruebas (testing)

| ID Caso Prueba | Descripción Caso de Prueba                         | Entrada            | Salida Esperada | Resultado |
|---------------|-------------------------------------------------|--------------------|----------------|-----------|
| CP-001       | Suma de dos números positivos                    | 5 + 3 =            | 8              | OK |
| CP-002       | Suma de número positivo y negativo               | 7 + (-2) =         | 5              | OK |
| CP-003       | Resta de dos números                             | 9 - 4 =            | 5              | OK |
| CP-004       | Multiplicación de dos números positivos          | 6 * 3 =            | 18             | OK |
| CP-005       | Multiplicación con un número negativo            | 4 * (-2) =         | -8             | OK |
| CP-006       | División de dos números                          | 8 / 2 =            | 4              | OK |
| CP-007       | División entre cero                              | 5 / 0 =            | Error          | OK |
| CP-008       | Agregar decimal a un número                      | 3.5                | 3.5            | OK |
| CP-009       | Operación con números decimales                  | 2.5 + 1.5 =        | 4.0            | OK |
| CP-010       | Borrar resultados                                | 5 + 3, luego C     | Pantalla vacía | OK |
| CP-011       | Uso del botón igual sin operación                | =                  | Mismo número   | OK |
| CP-012       | Guardar/sumar número en memoria (M+)             | 6, M+              | Memoria = +6   | OK |
| CP-013       | Borrar número en memoria (MC)                    | MC                 | Memoria = 0    | OK |
| CP-014       | Recuperar número de memoria                      | MR                 | Último valor M | OK |
| CP-015       | Cambio de signo positivo a negativo              | 5, ±               | -5             | OK |
| CP-016       | Cambio de signo negativo a positivo              | -7, ±              | 7              | OK |
| CP-017       | Los colores y tamaños de los botones cumplen criterios de usabilidad/accesibilidad | N/D | Cumple con los estándares visuales y de accesibilidad | OK |
| CP-018       | Estructura del proyecto                          | N/D                | Se utiliza la división por paquetes MVC; VistaControlador y Modelo para organizar las clases. | OK |
| CP-019       | Comprobación fichero `jar`                       | Proyecto compilado | Se genera y prueba el fichero `jar` empaquetado. | OK |


