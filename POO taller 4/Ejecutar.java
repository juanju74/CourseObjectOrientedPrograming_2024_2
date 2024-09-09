public class Ejecutar {
    public static void main(String[] args) {
        Perfume objPerfume = new Perfume("Eternity", "Calvin Klein", 100.0, 75.0);
        System.out.println("Aplicar perfume: " + objPerfume.aplicarPerfume(10.0));
        System.out.println("Consultar cantidad restante: " + objPerfume.consultarCantidadRestante());
        System.out.println("Ajustar precio: " + objPerfume.ajustarPrecio(80.0));
    }
}

