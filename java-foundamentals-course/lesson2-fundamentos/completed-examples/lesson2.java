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
