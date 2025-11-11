// Ejemplo: Encapsulación e instanciación simple
class Persona {
    // Atributos privados (solo accesibles dentro de la clase)
    private String nombre;
    private int edad;

    // Constructor: inicializa los valores al crear el objeto
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter: obtiene el valor del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter: cambia el valor del nombre de forma controlada
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para edad, con validación
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Edad inválida, debe ser positiva.");
        } else {
            this.edad = edad;
        }
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}


public class Main {
    public static void main(String[] args) {
        // Instanciación: crear un objeto de la clase Persona
        Persona persona1 = new Persona("Ana", 16);

        // Mostramos su información
        persona1.mostrarInfo();

        // Cambiamos la edad con el setter
        persona1.setEdad(18);
        persona1.mostrarInfo();
    }
}