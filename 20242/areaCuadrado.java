import java.util.Scanner;

public class areaCuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = leerNumero(entrada);
        mostrarNumero(numero);

        int lado = 2;
        int area = calcularAreaCuadrado(lado);
        mostrarAreaCuadrado(area);

        entrada.close();
    }

    public static int leerNumero(Scanner entrada) {
        System.out.println("Digite el número:");
        return entrada.nextInt();
    }

    public static void mostrarNumero(int numero) {
        System.out.println("Número que usted digitó es = " + numero);
    }

    public static int calcularAreaCuadrado(int lado) {
        return lado * lado;
    }

    public static void mostrarAreaCuadrado(int area) {
        System.out.println("Área del Cuadrado = " + area);
    }
}
