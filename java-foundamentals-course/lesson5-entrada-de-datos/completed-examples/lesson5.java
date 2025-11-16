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