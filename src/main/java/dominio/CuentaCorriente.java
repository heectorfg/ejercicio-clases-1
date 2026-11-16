package dominio;
//objetos
public class CuentaCorriente {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double descubierto;
//valor del atributo
    public CuentaCorriente() {
        this.numeroCuenta = " ";
        this.titular = " ";
        this.saldo = 0;
        this.descubierto = -500;
    }
//objeto a atributo
    public CuentaCorriente(String numeroCuenta, String titular, int saldo, int descubierto) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.descubierto = descubierto;
    }
//set & get
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }
//ingreso
    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("cantidad = " + cantidad);
        }
    }
//retirada
    public boolean retiro(double cantidad, double saldo, double descubierto) {
        if (cantidad > 0 && (this.saldo - cantidad) > descubierto) {
            this.saldo -= cantidad;
            return true;
        } else {
            System.out.println("cantidad = " + cantidad + ", saldo = " + saldo + ", descubierto = " + descubierto);
            return false;
        }

    }
//transferencia
    public double transferencia(CuentaCorriente destino, double cantidad) {
        return saldo;
    }
//si saldo esta em negativo
    public boolean estaNumerosRojos(int saldo) {
        return saldo < 0;
    }


    public void mostarCuenta(double saldo, String numeroCuenta, String titular) {
        System.out.println("Saldo: " + saldo + ".");
        System.out.println("Numero de cuenta: " + numeroCuenta + ".");
        System.out.println("Titular: " + titular + ".");
    }

    public String toString() {
        return "CuentaCorriente [numeroCuenta=" + numeroCuenta
                + ", titular=" + titular
                + ", saldo=" + saldo + "]";
    }
}


