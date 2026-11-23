package dominio;

import java.util.Scanner;

public class Reloj_digital {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean formato;            //formato por defecto sera 24h, formato = true es que esta en modo 24h

    Scanner entrada = new Scanner(System.in);

    public Reloj_digital() {
        this.hora = 0;
        this.segundo = 0;
        this.minuto = 0;
        this.formato = true;
    }

    public Reloj_digital(int hora, int segundo, int minuto, boolean formato) {
        this.hora = hora;
        this.segundo = segundo;
        this.minuto = minuto;
        this.formato = formato;
    }

    //setter & getter
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSeguno(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void cambiarFormato() {
        if (formato == true) {
            formato = false;
        } else {
            formato = true;
        }
    }

    public void ajustarHora(int h, int m, int s) {
        if (h >= 0 && h <= 23 &&
                m >= 0 && m <= 59 &&
                s >= 0 && s <= 59) {

            this.hora = h;
            this.minuto = m;
            this.segundo = s;

        } else {
            System.out.println("La hora no es válida");
        }
    }

    public void avanzarSegundo() {
        this.segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }

        if (minuto == 60) {
            minuto = 0;
            hora++;
        }

        if (hora == 24) {
            hora = 0;
        }
    }


    @Override
    public String toString() {
        int h = hora;

        if (!formato) {
            h = hora % 12;
            if (h == 0) {
                h = 12;
            }

            return String.format("%02d:%02d:%02d %s",
                    h, minuto, segundo, hora < 12 ? "AM" : "PM");
        }

        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void mostrarHora() {
        System.out.println(toString());
    }
}
