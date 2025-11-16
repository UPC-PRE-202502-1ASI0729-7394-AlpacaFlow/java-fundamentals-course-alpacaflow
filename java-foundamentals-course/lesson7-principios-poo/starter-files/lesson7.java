// PLANTILLA PARA LECCION 7
class [NombreClase] {
    // ATRIBUTOS PRIVADOS
    private [tipo] [atributo1];
    private [tipo] [atributo2];
    
    // CONSTRUCTOR
    public [NombreClase]([tipo] [atributo1], [tipo] [atributo2]) {
        this.[atributo1] = [atributo1];
        this.[atributo2] = [atributo2];
    }
    
    // MÉTODOS GETTER
    public [tipo] get[Atributo1]() {
        return [atributo1];
    }
    
    public [tipo] get[Atributo2]() {
        return [atributo2];
    }
    
    // MÉTODOS SETTER  
    public void set[Atributo1]([tipo] [atributo1]) {
        this.[atributo1] = [atributo1];
    }
    
    public void set[Atributo2]([tipo] [atributo2]) {
        this.[atributo2] = [atributo2];
    }
}

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        // Crear objeto
        [NombreClase] [objeto] = new [NombreClase]([valor1], [valor2]);
        
        // Mostrar información en la consola
        System.out.println("[Texto descriptivo]: " + [objeto].get[Atributo1]());
        System.out.println("[Texto descriptivo]: " + [objeto].get[Atributo2]());
    }
}