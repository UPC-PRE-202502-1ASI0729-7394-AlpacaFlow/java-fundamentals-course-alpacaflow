# Lección 4: Métodos en Java

## Información General
- **Duración:** 6 minutos
- **Objetivos:**
  - Entender qué son los métodos y por qué son útiles
  - Aprender a crear y llamar métodos
  - Conocer parámetros y valores de retorno
  - Ver ejemplos de sobrecarga de métodos

---

## Introducción (30 segundos)

"¡Bienvenidos a la Lección 4! Los métodos son bloques de código reutilizables que realizan tareas específicas."

**Ventajas:**
- Evitan duplicación de código
- Facilitan el mantenimiento
- Hacen el código más legible

---

## Definición de Métodos (1.5 minutos)

### Sintaxis Básica
```java
tipoRetorno nombreMetodo(parámetros) {
    // código del método
    return valor; // si retorna algo
}
```

### Método sin retorno (void)
```java
public static void saludar() {
    System.out.println("¡Hola, bienvenido!");
}

// Llamada al método
saludar();
```

### Método con retorno
```java
public static int sumar(int a, int b) {
    return a + b;
}

// Llamada al método
int resultado = sumar(5, 3);
System.out.println("Resultado: " + resultado); // 8
```

### Componentes de un método
- **Modificador:** `public`, `private` (visibilidad)
- **static:** Pertenece a la clase, no a una instancia
- **Tipo de retorno:** `int`, `String`, `void`, etc.
- **Nombre:** Identifica el método (camelCase)
- **Parámetros:** Datos de entrada (opcionales)
- **Cuerpo:** Código que ejecuta el método

---

## Parámetros y Argumentos (1.5 minutos)

### Sin parámetros
```java
public static void mostrarMensaje() {
    System.out.println("Este método no necesita parámetros");
}
```

### Con un parámetro
```java
public static void saludarPersona(String nombre) {
    System.out.println("Hola, " + nombre + "!");
}

saludarPersona("Ana"); // Hola, Ana!
```

### Con múltiples parámetros
```java
public static double calcularPromedio(double nota1, double nota2, double nota3) {
    return (nota1 + nota2 + nota3) / 3.0;
}

double promedio = calcularPromedio(85.5, 90.0, 88.5);
System.out.println("Promedio: " + promedio); // 88.0
```

### Parámetros vs Argumentos
- **Parámetros:** Variables en la definición del método
- **Argumentos:** Valores reales que se pasan al llamar el método

---

## Sobrecarga de Métodos (1.5 minutos)

**Sobrecarga:** Tener múltiples métodos con el mismo nombre pero diferentes parámetros.

### Ejemplo: Método calcular
```java
// Sumar dos enteros
public static int sumar(int a, int b) {
    return a + b;
}

// Sumar tres enteros
public static int sumar(int a, int b, int c) {
    return a + b + c;
}

// Sumar dos decimales
public static double sumar(double a, double b) {
    return a + b;
}

// Uso:
System.out.println(sumar(5, 3));           // 8
System.out.println(sumar(5, 3, 2));        // 10
System.out.println(sumar(5.5, 3.2));       // 8.7
```

**Reglas de sobrecarga:**
- Mismo nombre
- Diferente número de parámetros O diferentes tipos de parámetros
- El tipo de retorno puede variar pero no es suficiente por sí solo

---

## 🎨 Ámbito de Variables (1 minuto)

### Variables locales
```java
public static void metodo1() {
    int x = 10; // Variable local de metodo1
    System.out.println(x);
}

public static void metodo2() {
    // System.out.println(x); // ERROR: x no existe aquí
    int x = 20; // Esta es otra variable diferente
}
```

### Variables globales (de clase)
```java
public class Calculadora {
    static double PI = 3.14159; // Variable global
    
    public static double calcularAreaCirculo(double radio) {
        return PI * radio * radio; // Accede a PI
    }
}
```

---

## 💻 Ejercicio Práctico (30 segundos)

En los archivos encontrarán una **Calculadora con Métodos** que incluye:
- Métodos para operaciones básicas (+, -, *, /)
- Métodos con y sin retorno
- Sobrecarga de métodos
- Cálculo de áreas y conversiones

*Ver starter-files/lesson4.java para practicar y completed-examples/lesson4.java para la solución.*

---

## 🎓 Resumen (30 segundos)

**Estructura de un método:**
```java
public static tipoRetorno nombre(parámetros) {
    // código
    return valor;
}
```

**Tipos de métodos:**
- Con retorno: devuelven un valor
- Sin retorno (`void`): solo ejecutan acciones

**Ventajas:**
- Reutilización de código
- Mejor organización
- Facilita el mantenimiento

**Sobrecarga:** Mismo nombre, diferentes parámetros

---

## 🔗 Próxima Lección

**Lección 5: Entrada de Datos**
- Uso de Scanner
- Validación de datos
- Manejo de excepciones básicas

---

**¡Practiquen creando sus propios métodos y nos vemos pronto! 🚀**