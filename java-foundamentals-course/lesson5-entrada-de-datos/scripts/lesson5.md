# Lección 5: Entrada y salida de datos en Java
**Duración:** 6–7 minutos

## Objetivo
Aprender a usar la salida por consola con `System.out.println` y la entrada de datos con la clase `Scanner`.

## Introducción
Esta lección te permitirá crear programas interactivos mediante entrada y salida de datos.

## Salida de datos: System.out.println
```java
System.out.println("Hola, mundo");
```

## Entrada de datos: Clase Scanner
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String nombre = sc.nextLine();
int edad = sc.nextInt();
sc.close();
```

## Ejemplo práctico
```java
import java.util.Scanner;

public class EstudioSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre de tu curso: ");
        String curso = sc.nextLine();
        System.out.print("¿Cuántas horas estudias a la semana?: ");
        int horas = sc.nextInt();
        System.out.println("Estudias " + horas + " horas de " + curso + " cada semana.");
        sc.close();
    }
}
```

## Starter File
```java
import java.util.Scanner;

public class Leccion5Starter {
    public static void main(String[] args) {
        // TODO: Crear Scanner
        // TODO: Leer nombre
        // TODO: Leer edad
        // TODO: Mostrar mensaje usando los datos
        // TODO: Cerrar Scanner
    }
}
```

## Completed Example
```java
import java.util.Scanner;

public class Leccion5Completed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Cuántas horas estudias a la semana?: ");
        int horas = sc.nextInt();

        System.out.println();
        System.out.println("Resumen de datos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Horas de estudio por semana: " + horas);

        sc.close();
    }
}
```
