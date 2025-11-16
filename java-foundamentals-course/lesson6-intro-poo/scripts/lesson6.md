# Lección 6: Introducción a la Programación Orientada a Objetos (POO)
**Duración:** 5 minutos

## Objetivo
Comprender los fundamentos de la Programación Orientada a Objetos: **clases, objetos, atributos y métodos**, y crear tu primera clase en Java.

## Introducción
La Programación Orientada a Objetos (POO) es una forma de programar basada en objetos: entidades que tienen **características** y **comportamientos**.  
En Java, todo gira en torno a ellos.

---

## ¿Qué es una clase?
Una clase es una *plantilla* que define cómo será un objeto.

```java
public class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
```

---

## ¿Qué es un objeto?
Un objeto es una instancia de la clase.

```java
Persona p = new Persona();
p.nombre = "Javier";
p.edad = 18;
p.saludar();
```

---

## Atributos
Representan las características del objeto.

---

## Métodos
Representan las acciones que el objeto puede realizar.

---

## Ejemplo completo

```java
public class Auto {
    String marca;
    int año;

    void mostrarDatos() {
        System.out.println("Auto: " + marca + " (" + año + ")");
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.marca = "Toyota";
        a.año = 2020;
        a.mostrarDatos();
    }
}
```

---

## Starter File
```java
public class Leccion6Starter {

    // TODO: Crear clase Estudiante con atributos nombre y edad
    // TODO: Agregar método presentar()

}

class Main {
    public static void main(String[] args) {

        // TODO: Crear un objeto Estudiante
        // TODO: Asignar valores
        // TODO: Llamar presentar()

    }
}
```

---

## Completed Example
```java
public class Estudiante {
    String nombre;
    int edad;

    void presentar() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
}

class Main {
    public static void main(String[] args) {

        Estudiante e = new Estudiante();
        e.nombre = "Javier";
        e.edad = 18;

        e.presentar();
    }
}
```

---

