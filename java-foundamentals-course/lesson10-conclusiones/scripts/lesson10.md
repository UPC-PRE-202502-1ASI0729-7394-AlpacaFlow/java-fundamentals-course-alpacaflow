# Lección 10: Mejores Prácticas y Errores Comunes en Java

**Duración:** 6 minutos

---

## Objetivo

Aprender a escribir código **limpio, legible y sin errores frecuentes** en Java, aplicando buenas prácticas de desarrollo.

---

## Introducción

Al comenzar a programar, es común cometer errores simples que pueden causar fallos o dificultar la lectura del código.  
Esta lección te enseñará **cómo evitarlos** y cómo mantener tu código **organizado y profesional**.

> _Escribir código limpio no significa escribir menos, sino escribir de forma clara, ordenada y fácil de mantener._

---

## Buenas prácticas generales

### 1. Usa nombres descriptivos

Los nombres de variables, clases y métodos deben reflejar **su propósito**.

**Correcto:**

```java
int edadUsuario;
double promedioNotas;
```

**Incorrecto:**

```java
int e;
double p;
```

### 2. Sigue las convenciones de Java

| **Elemento**            | **Convención**               | **Ejemplo**                          |
| ----------------------- | ---------------------------- | ------------------------------------ |
| **Clases**              | Capitalizar cada palabra     | `public class EstudianteRegistro {}` |
| **Métodos y variables** | Notación _camelCase_         | `calcularPromedio()`, `notaFinal`    |
| **Constantes**          | Mayúsculas con guiones bajos | `MAX_ESTUDIANTES = 30`               |

### 3. Comenta el código con sentido

Los comentarios deben explicar el porqué, no repetir lo que el código ya dice.

**Correcto**

```java
// Calcula el promedio de las notas ingresadas por el usuario

double promedio = suma / cantidadNotas;

```

**Incorrecto:**

```java
// Suma dividido entre cantidad

double promedio = suma / cantidadNotas;
```

### 4. Usa indentación y formato consistente

Mantén el código ordenado usando sangrías (tabs o espacios).
Esto facilita leer estructuras como condicionales o bucles.

```java
if (promedio >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}
```

### 5. Divide el código en métodos

Evita tener un main() gigante.
Divide tus tareas en métodos pequeños y reutilizables.

```java
public static void mostrarResultado(double promedio) {
    if (promedio >= 11) System.out.println("Aprobado");
    else System.out.println("Desaprobado");
}
```

## Errores comunes en principiantes

| **Error**                        | **Ejemplo**                                  | **Cómo evitarlo**                              |
| -------------------------------- | -------------------------------------------- | ---------------------------------------------- |
| Olvidar cerrar llaves `{}`       | `if (x > 0) System.out.println("ok");`       | Usa sangría clara y un IDE que marque errores. |
| Confundir `=` con `==`           | `if (x = 5)`                                 | Recuerda: `=` asigna, `==` compara.            |
| No inicializar variables         | `int edad; System.out.println(edad);`        | Siempre asigna un valor inicial.               |
| Errores de mayúsculas/minúsculas | `System.out.println` vs `system.out.Println` | Java diferencia mayúsculas y minúsculas.       |
| Uso incorrecto de tipos          | `int promedio = 15.6;`                       | Asegúrate de usar `double` para decimales.     |

## Consejos finales

- Lee tus errores (stack trace): te indica el archivo, línea y tipo de error.

- Guarda versiones de tu trabajo con Git o copias de respaldo.

- No temas cometer errores: cada error te enseña algo.

- Comenta tu código y usa nombres claros.

- Practica todos los días: la constancia mejora tu lógica y confianza.

## Recursos recomendados

| **Recurso**                                | **Descripción**                                                        | **Enlace**                                                                                   |
| ------------------------------------------ | ---------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| **Java Code Conventions – Oracle**         | Guía oficial de Oracle sobre las convenciones de codificación en Java. | [Ver recurso](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html) |
| **Guía rápida de estilo Java – W3Schools** | Explicación práctica de buenas prácticas y ejemplos de estilo.         | [Ver guía](https://www.w3schools.com/java/)                                                  |
