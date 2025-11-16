// Clase principal del objeto (puedes cambiar el nombre y atributos según el ejercicio)
class NombreClase {
    // Atributos
    TipoDato atributo1;
    TipoDato atributo2;

    // Constructor
    NombreClase(TipoDato atributo1, TipoDato atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    // Método para mostrar información del objeto
    void mostrarInfo() {
        System.out.println("Atributo 1: " + atributo1 + ", Atributo 2: " + atributo2);
    }
}

// Clase principal del programa
public class Main {
    public static void main(String[] args) {

        // Crear un arreglo (o lista) de objetos
        NombreClase[] objetos = new NombreClase[3];

        // Inicializar los objetos
        objetos[0] = new NombreClase(valor1, valor2);
        objetos[1] = new NombreClase(valor3, valor4);
        objetos[2] = new NombreClase(valor5, valor6);

        // Mostrar la información de todos los objetos
        for (int i = 0; i < objetos.length; i++) {
            objetos[i].mostrarInfo();
        }

        // Ejemplo de cálculo (suma, promedio, búsqueda, etc.)
        // --- Ajusta esto según el ejercicio ---
        double suma = 0;
        for (int i = 0; i < objetos.length; i++) {
            // Ejemplo: si atributo2 es un número
            suma += objetos[i].atributo2;
        }

        double promedio = suma / objetos.length;
        System.out.println("Promedio: " + promedio);
    }
}
