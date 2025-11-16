// ✅ Completed Example: Sistema de Registro de Estudiantes
// Autor: Marcelo B.
// Lección 9 - Desarrollo práctico de un programa con POO

import java.util.Scanner;

// ------------------- Clase Estudiante -------------------
class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("---------------------------");
    }
}

// ------------------- Clase RegistroEstudiantes -------------------

class RegistroEstudiantes {
    private Estudiante[] estudiantes;
    private int contador;

    public RegistroEstudiantes(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        contador = 0;
    }

    public void agregarEstudiante(Estudiante e) {
        if (contador < estudiantes.length) {
            estudiantes[contador] = e;
            contador++;
            System.out.println("Estudiante agregado correctamente.\n");
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("\n=== Lista de Estudiantes ===");
        if (contador == 0) {
            System.out.println("No hay estudiantes registrados aún.");
        } else {
            for (int i = 0; i < contador; i++) {
                estudiantes[i].mostrarInformacion();
            }
        }
    }
}

// ------------------- Clase Main -------------------

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroEstudiantes registro = new RegistroEstudiantes(5);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Sistema de Registro de Estudiantes ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();

                    Estudiante nuevo = new Estudiante(nombre, edad, carrera);
                    registro.agregarEstudiante(nuevo);
                    break;

                case 2:
                    registro.mostrarEstudiantes();
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Programa finalizado. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
