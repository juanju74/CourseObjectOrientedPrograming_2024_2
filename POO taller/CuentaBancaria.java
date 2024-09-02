public class CuentaBancaria {

    // Atributos de la clase
    private int numeroCuenta;
    private double saldo;
    private String titular;

    // Método Constructor
    public CuentaBancaria(int numeroCuenta, double saldo, String titular) {

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Metodos de la clase

    public String mostrarTitular() {
        return "el titular de la cuenta es:" + titular;
    }

    public String consultarSaldo() {
        return "el saldo es: " + saldo;
    }

    public String retiro(double cantidad) {
        saldo -= cantidad;
        return "El retiro fue:" + cantidad + " Y el saldo es: " + saldo;
    }

    public String deposito(double cantidad) {
        saldo += cantidad;
        return "El Deposito fue:" + cantidad + " Y el saldo es: " + saldo;
    }

}