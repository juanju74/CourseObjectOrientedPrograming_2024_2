public class Ejecutar {
    public static void main(String[] args) {
        CuentaBancaria objCuentaBancaria = new CuentaBancaria(546654, 500, "juan");
        System.out.println("titular:" + objCuentaBancaria.mostrarTitular());
        System.out.println("saldo:" + objCuentaBancaria.consultarSaldo());
        System.out.println("retiro:" + objCuentaBancaria.retiro(100.0));
        System.out.println("deposito" + objCuentaBancaria.deposito(1000.0));
        System.out.println("Consultar" + objCuentaBancaria.consultarSaldo());

    }
}
