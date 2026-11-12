package dominio;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velActual;
    private int velMaxima;

    public Coche() {
        this.marca = " ";
        this.modelo = " ";
        this.velMaxima = 0;
    }

    public Coche(String marca, String modelo, String color, int velActual, int velMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velMaxima = velMaxima;

        if (velActual > velMaxima) {
            this.velMaxima = velActual;
        } else if (velActual < 0) {
            this.velActual = 0;
        } else {
            this.velActual = velActual;
        }

    }

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

    public void setVelActual(int velActual) { this.velActual = velActual; }
    public int getVelActual() { return velActual; }

    public void setVelMaxima(int velMaxima) { this.velMaxima = velMaxima; }
    public int getVelMaxima() { return velMaxima; }

    public boolean estaParado(int velActual) {
        return velActual == 0;
    }

    public void pintarCoche(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void acelerar(int cantidad) {
        this.velActual += cantidad;
        if (velActual < 0) {
            this.velActual = 0;
        }
    }

    public void frenar(int cantidad) {
        this.velActual -= cantidad;
        if (velActual < 0) {
            this.velActual = 0;
        }
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velActual);
        System.out.println("Velocidad maxima: " + velMaxima);
    }

    public String toString() {
        return "Coche [marca=" + marca + ",modelo=" + modelo + ",color=" + color +
                "\n,velocidad actual=" + velActual + ",velocidad maxima=" + velMaxima + "]";
    }


}
