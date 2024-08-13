import java.util.Scanner;

public class Aprender {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner (System.in);
        int numero;

        System.out.println("Digite el numero");
        numero = entrada1.nextInt();
        System.out.println("numero que ud digito es = " + numero);
        
        int b = 0; 
        int areaCuadrado = 0;  
        
        b = 2; // Asignación de la variable
        areaCuadrado = b * b; // Fórmula para hallar el área de un cuadrado
        System.out.println("Área del Cuadrado = " + areaCuadrado); //Mensaje de salida

        System.out.println(" El empleado Juan Arboleda Gana de Salario Bruto 1.460.000 puesto que 1.300.000 son de salario base y 160,000 de auxilio transportes,Comisiones son 392.000 y deducciones son 104.000");
        
        //Inicializacion de variables
        int SalarioBase = 0;
        int Auxiliotransportes = 0;
        int Comisiones = 0;
        int deducciones = 0;
        int SalarioBruto = 0;
        int SalarioNeto = 0;

        //Asignar variables 
        SalarioBase=1300000;
        Auxiliotransportes = 160000;
        SalarioBruto = (SalarioBase + Auxiliotransportes) ;
        Comisiones = 392000;
        deducciones = 104000 ;
        System.out.println("El salario bruto es ="+SalarioBruto);
        SalarioNeto = ((SalarioBruto-deducciones)+Comisiones) ;
        System.out.println("El Salario Neto del trabajador Juan Arboleda es = "+SalarioNeto);

        // Dolares a Pesos 
        // Inicializacion de Variables
        int Dolar1 = 0 ;
        int pesosC1 = 0;
        int DaP = 0;
        int PaD =0;
        int Eu=0;
        int PaE = 0;
        // Asignacion de Varibales
        Dolar1=1;
        pesosC1=4053;
        Scanner entrada = new Scanner (System.in);
        int Dolar2;
        System.out.println("Digite el numero de dolares que quiere convertir ");
        Dolar2 = entrada.nextInt();
        DaP = (Dolar2*pesosC1)/Dolar1;
        System.out.println("El numero de pesos convertidos es = "+DaP);

        Scanner entrada2 = new Scanner (System.in);
        int PesosC2 ;
        System.out.println("Digute el numero de pesos que quiere convertir");
        PesosC2 = entrada2.nextInt();
        PaD = (PesosC2*Dolar1)/pesosC1;
        System.out.println("El numero de dolares que convirtio es = "+PaD);

        Scanner entrada2 = new Scanner (System.in);
        int PesosC2 ;
        System.out.println("Digute el numero de pesos que quiere convertir");
        PesosC2 = entrada2.nextInt();
        PaD = (PesosC2*Dolar1)/pesosC1;
        System.out.println("El numero de dolares que convirtio es = "+PaD);






        


        




    }


    
}
