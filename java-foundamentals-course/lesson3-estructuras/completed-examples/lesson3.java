int edad = 18;
if (edad >= 18) {
    System.out.println("Mayor de edad");
} else {
    System.out.println("Menor de edad");
}

int nota = 85;
if (nota >= 90) {
    System.out.println("Excelente");
} else if (nota >= 80) {
    System.out.println("Muy bueno");
} else if (nota >= 70) {
    System.out.println("Bueno");
} else {
    System.out.println("Insuficiente");
}

int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}

for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}

int contador = 5;
while (contador > 0) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");

int opcion;
do {
    System.out.println("=== MENÚ ===");
    System.out.println("1. Opción 1");
    System.out.println("2. Salir");
    opcion = 2; // simulación
} while (opcion != 2);