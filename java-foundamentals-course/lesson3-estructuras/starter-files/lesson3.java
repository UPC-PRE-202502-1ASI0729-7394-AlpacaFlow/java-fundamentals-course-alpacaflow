// IF ELSE

int edad = 18;
if (edad >= 18) {
    
} else {
    
}

// ELSE IF

int nota = 85;
if () {
    
} else if () {
    
} else if () {
    
} else {
    
}

// SWITCH

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

// FOR LOOP

for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}

// WHILE LOOP

int contador = 5;
while (contador > 0) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");

// DO WHILE LOOP

int opcion;
do {
    System.out.println("=== MENÚ ===");
    System.out.println("1. Opción 1");
    System.out.println("2. Salir");
    opcion = 2; // simulación
} while (opcion != 2);