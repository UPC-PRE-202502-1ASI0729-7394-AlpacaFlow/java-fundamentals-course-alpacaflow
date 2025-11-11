// Reto: Encapsulación y métodos en una clase simple
// Crear una clase que represente una cuenta bancaria con saldo y titular, aplicando los principios de encapsulación.
class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // TODO: Crea un constructor que reciba el nombre del titular y el saldo inicial

    // TODO: Crea un método getter y setter para 'titular'

    // TODO: Crea un método getter para 'saldo' (solo lectura, sin setter)

    // Método para depositar dinero (solo si el monto es positivo)
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }

    // Método para retirar dinero (solo si hay suficiente saldo)
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Método para mostrar información de la cuenta
    public void mostrarInfo() {
        System.out.println("Titular: " + titular + " | Saldo actual: " + saldo);
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // TODO: Crea una instancia de CuentaBancaria con un titular y saldo inicial

        // TODO: Muestra la información inicial

        // TODO: Realiza un depósito y un retiro

        // TODO: Muestra la información final
    }
}

/*
Se espera que en la consola se muestre algo asi:
-----
Titular: Luis | Saldo actual: 500.0
Depósito exitoso. Nuevo saldo: 700.0
Retiro exitoso. Nuevo saldo: 550.0
Titular: Luis | Saldo actual: 550.0
------
*/
