# Lección 9: Desarrollo Práctico de un Programa en Java

**Objetivo:** Aplicar todos los conceptos aprendidos de Programación Orientada a Objetos (POO) en un proyecto funcional, que use clases, objetos, constructores, métodos, encapsulación y estructuras de datos.

---

## Introducción

En esta lección construiremos una **aplicación Java completa**, llamada **Sistema de Registro de Estudiantes**, que mostrará cómo los principios de la POO se integran para crear un programa real.

Usaremos:
- **Clases y objetos** → para modelar la información.
- **Encapsulación** → para proteger los datos.
- **Constructores** → para inicializar objetos.
- **Arrays** → para almacenar múltiples registros.
- **Métodos** → para modularizar la lógica.

> Este proyecto representa el cierre de la parte práctica del curso, integrando todos los módulos previos en un solo programa coherente.

---

## Estructura del proyecto

El proyecto se divide en tres clases principales:

| **Clase** | **Rol** | **Concepto aplicado** |
|------------|----------|-----------------------|
| `Estudiante` | Modelo base con atributos (nombre, edad, carrera) | Clases, Encapsulación |
| `RegistroEstudiantes` | Contenedor de objetos `Estudiante` | Arrays, Métodos |
| `Main` | Controla la ejecución | Entrada de usuario, Instanciación |

---

## Explicación paso a paso

1. **Definir la clase `Estudiante`:**  
   Creamos los atributos, constructor y métodos para representar un estudiante.

2. **Agregar la clase `RegistroEstudiantes`:**  
   Usamos un **array de objetos** para guardar varios estudiantes y funciones que gestionen los registros.

3. **Construir el `Main`:**  
   Mostramos un menú interactivo donde el usuario puede agregar y visualizar estudiantes.  
   Se aplican conceptos como **instanciación** y **modularidad**.

---

## Código inicial (starter file)

El estudiante deberá completar:
- Las clases vacías (`Estudiante` y `RegistroEstudiantes`).
- Los métodos de agregar y mostrar.
- El flujo del menú en `Main`.

---

## Resultado esperado

El usuario podrá:
1. Registrar varios estudiantes.  
2. Ver la lista completa.  
3. Finalizar el programa.

**Ejemplo de salida:**

```
=== Sistema de Registro de Estudiantes ===

Agregar estudiante

Mostrar todos

Salir
Selecciona una opción: 1
Nombre: Ana
Edad: 19
Carrera: Ingeniería de Software
Estudiante agregado correctamente.
```

---

## Reflexión final

Con esta lección el estudiante:
- Comprende la importancia de **diseñar con objetos**.
- Aprende a **organizar el código** en módulos.
- Se introduce a la idea de programas **reutilizables y escalables**.

Esta práctica servirá como base para proyectos más avanzados en Java, integrando interfaces gráficas o persistencia de datos.
