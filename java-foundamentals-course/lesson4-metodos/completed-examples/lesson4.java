// 1. Sintaxis Básica

tipoRetorno nombreMetodo(parámetros) {
    // código del método
    return valor; // si retorna algo
}

// 2. Método sin retorno (void)

public static void saludar() {
    
}

saludar();


// 3. Método con retorno
public static int sumar(int a, int b) {
    return a + b;
}

// Llamada al método
int resultado = sumar(5, 3);
System.out.println("Resultado: " + resultado); // 8


// Ejemplos adicionales
public static void mostrarMensaje() {
    System.out.println("Este método no necesita parámetros");
}

public static void saludarPersona(String nombre) {
    System.out.println("Hola, " + nombre + "!");
}

saludarPersona("Ana"); // Hola, Ana!

// 4. Sobrecarga de métodos

// Sumar dos enteros
public static int sumar(int a, int b) {
    return a + b;
}

// Sumar tres enteros
public static int sumar(int a, int b, int c) {
    return a + b + c;
}

// Sumar dos decimales
public static double sumar(double a, double b) {
    return a + b;
}

// Uso:
System.out.println(sumar(5, 3));           // 8
System.out.println(sumar(5, 3, 2));        // 10
System.out.println(sumar(5.5, 3.2));       // 8.7