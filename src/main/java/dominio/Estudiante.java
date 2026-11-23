package dominio;

import java.util.Arrays;

//objetos
public class Estudiante {
    private String nombre;
    private int edad;
    private String numIdentificacion;
    private double notas[] = new double[5];

    //creacion atributos
    public Estudiante() {
        this.nombre = " ";
        this.edad = 0;
        this.numIdentificacion = " ";

    }

    // CAMBIO: constructor nuevo con nombre, edad e ID
    public Estudiante(String nombre, int edad, String numIdentificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numIdentificacion = numIdentificacion;
    }

    //atributos a objetos
    public Estudiante(String nombre, int edad, String numIdentificacion, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numIdentificacion = numIdentificacion;
        this.notas = notas;
    }

    // setter & getter
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setEdad(int edad) { this.edad = edad; }
    public int getEdad() { return edad; }

    public void setNumIdentificacion(String numIdentificacion) { this.numIdentificacion = numIdentificacion; }
    public String getNumIdentificacion() { return numIdentificacion; }

    // CAMBIO: setter y getter de notas (faltaban)
    public void setNotas(double[] notas) { this.notas = notas; }
    public double[] getNotas() { return notas; }


    //asignar notas
    // CAMBIO: agregarNotas -> agregarNota
    public void agregarNota(int posicion, double nota) {
        if (posicion >= 0 && posicion < notas.length) {
            notas[posicion] = nota;
        }
    }

    //calcular media de boletin
    public double calcularPromedio() {
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        double media = total/notas.length;
        return media;
    }

    //buscar nota maxima
    // CAMBIO: notaMaxima -> obtenerNotaMaxima
    public double obtenerNotaMaxima() {
        double maxima = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maxima) {
                maxima = notas [i];
            }
        }
        return maxima;
    }

    //buscar nota minima
    // CAMBIO: notaMinima -> obtenerNotaMinima
    public double obtenerNotaMinima() {
        double minima = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < minima) {
                minima = notas [i];
            }
        }
        return minima;
    }

    //saber si esta aprobado si o no
    public boolean estaAprobado() {
        if (calcularPromedio() < 6.0) {
            return false;
        } else {
            return true;
        }
    }

    public void mostrarBoletin() {
        System.out.println("Las notas del alumno son: " + Arrays.toString(notas) + "." +
                "\n Y el promedio es: " + calcularPromedio() + "." +
                "\n La nota mas alta es: " + obtenerNotaMaxima() + " y la nota minima es: " + obtenerNotaMinima() + ".");
        if (estaAprobado()) {
            System.out.println("El alumno esta aprobado");
        } else {
            System.out.println("El alumno esta suspenso");
        }
    }

    @Override
    public String toString() {
        return "Alumno [nombre: " + nombre + ", edad: " + edad + ", ID: " + numIdentificacion + "]";
    }

}