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
