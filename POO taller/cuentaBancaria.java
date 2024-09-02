public class cuentaBancaria {

    // Atributos de la clase

    double saldo;
    private String titular;
    private int NumeroDeCuenta;
    double retiro;
    double deposito;

    // Método Constructor
    public cuentaBancaria(double saldo, double retiro, double deposito){

         this.saldo=saldo;
         this.retiro=retiro;
         this.deposito=deposito;
    }

    // Metodos de la clase

public String titular(){
    return "el titular de la cuenta es:"+titular;
}
public String saldo(double cantidad){
    saldo +=cantidad;
    return "el saldo es:"+saldo;

}
public String retiro(double retiro){
    saldo -=cantidad
    return "El retiro fue:"+retiro


}














    public static void main(String[] args) {
        cuentaBancaria objCuentaBancaria = new cuentaBancaria(1000,500,2000);
        System.out.println("titular:"+ objCuentaBancaria.titular());
        System.out.println("saldo:"+ objCuentaBancaria.saldo);
    }
}