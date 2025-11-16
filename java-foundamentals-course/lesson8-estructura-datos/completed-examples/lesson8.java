class Estudiante {
    String nombre;
    double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    void mostrarInfo() {
        System.out.println(nombre + " tiene nota " + nota);
    }
}

public class Main {
    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante("Jose", 17.0);
        estudiantes[1] = new Estudiante("Luis", 15.0);
        estudiantes[2] = new Estudiante("Rosa", 18.0);

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrarInfo();
        }

        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].nota;
        }

        double promedio = suma / estudiantes.length;

        System.out.println("Promedio del grupo: " + promedio);
    }
}
