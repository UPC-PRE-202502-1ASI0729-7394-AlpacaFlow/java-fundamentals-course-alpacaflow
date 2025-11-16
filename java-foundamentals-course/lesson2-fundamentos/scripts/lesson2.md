# Lección 2: Fundamentos de la Sintaxis en Java
**Duración:** 4 minutos

## Objetivo
Comprender los elementos básicos de la sintaxis de Java: **variables, tipos de datos, operadores y expresiones**, para comenzar a escribir programas simples y correctos.

## Introducción
En esta lección exploraremos los cimientos de la programación en Java.  
Aprenderás qué son las variables, cómo se declaran, qué tipos de datos existen y cómo realizar operaciones básicas.

Estos conceptos forman la base de cualquier programa, por más complejo que sea.

> _Dominar la sintaxis es el primer paso para pensar como un programador en Java._

## Variables y tipos de datos
Una **variable** es un espacio en memoria donde almacenamos un dato.  
En Java, cada variable debe tener un **tipo**, porque el lenguaje es **estáticamente tipado**.

### Ejemplos de tipos comunes
```java
int edad = 16;
double altura = 1.73;
boolean esEstudiante = true;
String nombre = "Javier";
```

### ¿Cómo funciona una variable?
| Elemento | Descripción | Ejemplo |
|----------|-------------|---------|
| Tipo     | Tipo de dato almacenado | int |
| Nombre   | Identificador de la variable | edad |
| Valor    | Dato asignado | 16 |

## Operadores básicos
Los operadores permiten realizar **cálculos y comparaciones**.

### Operadores matemáticos
```java
int suma = 10 + 5;
int resta = 10 - 3;
int producto = 4 * 2;
int division = 20 / 4;
int residuo = 10 % 3;
```

### Operadores de comparación
```java
boolean mayor = 10 > 5;
boolean igual = 7 == 7;
boolean diferente = 4 != 3;
```

## Concatenación de texto
```java
System.out.println("Mi nombre es " + nombre);
```

## Ejemplo práctico: Promedio de notas
```java
double nota1 = 15;
double nota2 = 14;
double nota3 = 18;

double promedio = (nota1 + nota2 + nota3) / 3;

System.out.println("Promedio final: " + promedio);
```

## Starter File
```java
public class Leccion2Starter {

    public static void main(String[] args) {

        // TODO: Crea variables de tipo int, double, boolean y String
        // TODO: Muestra sus valores en consola
        // TODO: Realiza operaciones matemáticas simples
        // TODO: Realiza comparaciones y muestra los resultados
    }
}
```

## Completed Example
```java
public class Leccion2Completed {

    public static void main(String[] args) {

        int edad = 16;
        double altura = 1.73;
        boolean esEstudiante = true;
        String nombre = "Javier";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es estudiante?: " + esEstudiante);

        int a = 10;
        int b = 3;

        int suma = a + b;
        int resta = a - b;
        int producto = a * b;
        int division = a / b;
        int residuo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + producto);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);

        boolean mayor = a > b;
        boolean igual = a == b;

        System.out.println("¿a es mayor que b?: " + mayor);
        System.out.println("¿a es igual a b?: " + igual);

        double nota1 = 15;
        double nota2 = 14;
        double nota3 = 18;

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio final: " + promedio);
    }
}
```

## Recursos recomendados
| Recurso | Descripción | Enlace |
|--------|-------------|--------|
| Tipos de datos en Java – Oracle | Referencia oficial sobre tipos primitivos | https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html |
| Operadores en Java – W3Schools | Explicación clara de operadores matemáticos y lógicos | https://www.w3schools.com/java/java_operators.asp |

