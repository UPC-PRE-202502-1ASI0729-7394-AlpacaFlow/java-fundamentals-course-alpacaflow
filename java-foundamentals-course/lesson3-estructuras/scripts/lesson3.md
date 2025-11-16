# Lección 3: Estructuras de Control en Java

## 📋 Información General
- **Duración:** 6 minutos
- **Objetivos:**
  - Comprender estructuras condicionales (if, switch)
  - Conocer estructuras iterativas (for, while)
  - Ver ejemplos prácticos básicos

---

## 🎯 Introducción (30 segundos)

"¡Bienvenidos a la Lección 3! Las **estructuras de control** permiten que nuestros programas tomen decisiones y repitan acciones."

---

## 📚 Estructuras Condicionales (2 minutos)

### if-else
```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Mayor de edad");
} else {
    System.out.println("Menor de edad");
}
```

### if-else if-else
```java
int nota = 85;
if (nota >= 90) {
    System.out.println("Excelente");
} else if (nota >= 80) {
    System.out.println("Muy bueno");
} else if (nota >= 70) {
    System.out.println("Bueno");
} else {
    System.out.println("Insuficiente");
}
```

### switch
```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}
```
**Importante:** No olvidar el `break` en switch.

---

## 🔄 Estructuras Iterativas (2 minutos)

### Bucle for
```java
// Contar del 1 al 5
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

### Bucle while
```java
// Cuenta regresiva
int contador = 5;
while (contador > 0) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");
```

### Bucle do-while
```java
// Se ejecuta al menos una vez
int opcion;
do {
    System.out.println("=== MENÚ ===");
    System.out.println("1. Opción 1");
    System.out.println("2. Salir");
    opcion = 2; // simulación
} while (opcion != 2);
```

**Diferencia clave:** `do-while` ejecuta el código al menos una vez; `while` puede no ejecutarse nunca.

---

## ⚡ Control de Flujo (1 minuto)

### break - Termina el bucle
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}
// Imprime: 1, 2, 3, 4
```

### continue - Salta a la siguiente iteración
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
// Imprime: 1, 2, 4, 5 (omite el 3)
```

---

## 💻 Ejercicio Práctico (30 segundos)

En los archivos encontrarán un **Sistema de Gestión de Estudiantes** que combina:
- Menú con `switch`
- Validación con `if-else`
- Cálculo de promedios con bucles
- Búsqueda con `break`

*Ver starter-files/lesson3.java para practicar y completed-examples/lesson3.java para la solución.*

---

## 🎓 Resumen (30 segundos)

**Condicionales:**
- `if-else`: decisiones simples
- `switch`: múltiples opciones

**Bucles:**
- `for`: sabes cuántas veces iterar
- `while`: iterar mientras se cumpla condición
- `do-while`: ejecutar al menos una vez

**Control:**
- `break`: salir del bucle
- `continue`: saltar iteración

---

## 🔗 Próxima Lección

**Lección 4: Métodos en Java**

---

**¡Practiquen con el ejercicio y nos vemos pronto! 🚀**
