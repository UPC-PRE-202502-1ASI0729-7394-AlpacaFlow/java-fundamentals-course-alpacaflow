// Starter File: Sistema de Registro de Estudiantes (Versión Incompleta)
// Objetivo: Completa las secciones faltantes para crear una aplicación Java
// que permita registrar estudiantes y mostrar su información.

// TODO: Crea la clase Estudiante con atributos: nombre, edad y carrera.
// - Implementa getters y setters para cada atributo.
// - Agrega un método mostrarInformacion() que imprima los datos.

import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
         
    }

    public String getNombre() {
         
    }

    public void setNombre(String nombre) {
         
    }

    public int getEdad() {
         
    }

    public void setEdad(int edad) {
         
    }

    public String getCarrera() {
         
    }

    public void setCarrera(String carrera) {
         
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("---------------------------");
    }
}
// TODO: Crea la clase RegistroEstudiantes con:
// - Un array de Estudiante
// - Un método agregarEstudiante()
// - Un método mostrarEstudiantes()
class RegistroEstudiantes {
    private Estudiante[] estudiantes;
    private int contador;

    public RegistroEstudiantes(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        contador = 0;
    }

    public void agregarEstudiante(Estudiante e) {
         if(contador < estudiantes.length){
             
            System.out.println("Estudiante agregado. \n");
         }else{
             System.out.println("No hay estudiante registrado.");
         }
    }

    public void mostrarEstudiantes() {
         System.out.println("\n=== Lita de Estudiantes ===");
         if(contador == 0){
             System.out.println("No hay estudiantes registrados.");
         }else {
             
         }
    }
}
// TODO: Crea el método main() para:
// - Mostrar un menú (Agregar, Mostrar, Salir)
// - Pedir datos al usuario usando Scanner
// - Instanciar objetos y llamar métodos del registro

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
                    
                    System.out.print("Edad: ");
                    
                    sc.nextLine();
                    System.out.print("Carrera: ");
                    

                    
                    break;

                case 2:
                    
                    break;

                case 3:
                   
                    System.out.println("Programa finalizado. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
