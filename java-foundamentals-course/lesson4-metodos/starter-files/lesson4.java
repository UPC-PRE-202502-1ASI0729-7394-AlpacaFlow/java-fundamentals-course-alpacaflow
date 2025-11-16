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
public static int sumar() {
    
}

// Llamada al método
System.out.println();


// Ejemplos adicionales
public static void mostrarMensaje() {
    System.out.println("Este método no necesita parámetros");
}

public static void saludarPersona() {
    System.out.println("Hola, " + "!");
}

saludarPersona(); // Hola, Ana!

// 4. Sobrecarga de métodos

// Sumar dos enteros
public static int sumar() {
    
}

// Sumar tres enteros
public static int sumar() {
    
}

// Sumar dos decimales
public static double sumar() {
   
}

// Uso:
System.out.println(sumar());           // 8
System.out.println(sumar());        // 10
System.out.println(sumar());       // 8.7