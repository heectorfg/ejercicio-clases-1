import dominio.Coche;
import dominio.CuentaCorriente;
import dominio.Libro;

void main() {
    Scanner entrada = new Scanner(System.in);
    menu(entrada);
}

void menu(Scanner entrada) {
    System.out.println("Elije que programa quieres ejecutar:" +
            "\n-ejercicio 1 (1)" +
            "\n-ejercicio 2 (2)" +
            "\n-ejercicio 3 (3)");
    int usuario = entrada.nextInt();
    switch (usuario) {
        case 1->
            ejercicio1(entrada);
        case 2->
            ejercicio2();
        case 3->
            ejercicio3();
    }
}


void ejercicio1(Scanner entrada) {
    Libro[] libros = {new Libro("Titulo1", "6565-4444444", "autor1", 90),
            new Libro("Titulo2", "6565-4444444", "autor3", 90),
            new Libro("Titulo3", "6565-4444444", "autor3", 90)};

    for (Libro libro : libros) {
        libro.mostrarInformacion();
        System.out.println(libro.libroLargo() ? "Es un libro largo" : "Es un libro corto");
    }
}

void ejercicio2() {
    Coche[] coches = {new Coche("Seat", "Ibiza", "Amarillo", 90, 100),
            new Coche("Toyota", "Corolla", "Rojo", 50, 200)};

    for(Coche coche : coches) {
        coche.mostrarEstado();
        System.out.println(coche.estaParado(coche.getVelActual()) ? "El coche esta parado" : "El coche esta en marcha");

        coche.acelerar(100);
        System.out.println("Tras acelerar 100: " + getClass());
    }
}

void ejercicio3() {
    CuentaCorriente[] cuenta = {};
}
