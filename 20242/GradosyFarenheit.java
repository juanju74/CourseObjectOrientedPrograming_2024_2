public class GradosyFarenheit {
    public static void main(String[] args) {
        System.out.println("Programación orientada a objetos");
        int juan = 242342;
        System.out.println("El número es " + juan);

        double C = 0.0;
        double F = 0.0;

        C = 1;
        F = 1;

        double gradosCentigrados = ((F - 32.0) / (9.0 / 5.0));
        double gradosFarenheit = C * (9.0 / 5.0) + 32.0;

        System.out.println(F + " °F a °C: " + gradosCentigrados);
        System.out.println(C + " °C a °F: " + gradosFarenheit);
    }
}
