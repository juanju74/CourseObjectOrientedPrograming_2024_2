public class ejecutar {
    public static void main(String[] args) {
        // Crear un objeto Libro
        Libro objLibro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0", 471);

        // Simular el proceso de préstamo y devolución
        System.out.println("Estado del libro: " + objLibro.estaDisponible());
        System.out.println("Préstamo del libro: " + objLibro.prestar());
        System.out.println("Estado después del préstamo: " + objLibro.estaDisponible());
        System.out.println("Devolución del libro: " + objLibro.devolver());
        System.out.println("Estado después de la devolución: " + objLibro.estaDisponible());
    }
}
