import java.util.Scanner;

public class DolaresaPesos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        dolaresaPesos(entrada);
        pesosaDolares(entrada);
        pesosaEuros(entrada);

      
        entrada.close();
    }
//Dolares a pesos
    public static void dolaresaPesos(Scanner entrada) {
        int dolar1 = 1;
        int pesosC1 = 4053;

        System.out.println("Digite el número de dólares que quiere convertir: ");
        int dolar2 = entrada.nextInt();
        int daP = (dolar2 * pesosC1) / dolar1;
        System.out.println("El número de pesos convertidos es = " + daP);
    }

    //Pesos a Dolares
    public static void pesosaDolares(Scanner entrada) {
        int dolar1 = 1;
        int pesosC1 = 4053;

        System.out.println("Digite el número de pesos que quiere convertir a dólares: ");
        int pesosC2 = entrada.nextInt();
        int paD = (pesosC2 * dolar1) / pesosC1;
        System.out.println("El número de dólares que convirtió es = " + paD);
    }
    // pesos a Euros
    
    public static void pesosaEuros(Scanner entrada) {
        int euro = 1;
        int pesosC4 = 4425;

        System.out.println("Digite el número de pesos que quiere convertir a euros: ");
        int pesosC3 = entrada.nextInt();
        int paE = (pesosC3 * euro) / pesosC4;
        System.out.println("El número de euros que convirtió es = " + paE);
    }
}



