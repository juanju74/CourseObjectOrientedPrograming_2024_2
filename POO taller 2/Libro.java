public class Libro {

    // Atributos de la clase
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean disponible;

    // Método Constructor
    public Libro(String titulo, String autor, String ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true; // El libro está disponible cuando se crea
    }

    // Métodos de la clase

    public String prestar() {
        if (disponible) {
            disponible = false;
            return "El libro '" + titulo + "' ha sido prestado.";
        } else {
            return "El libro '" + titulo + "' no está disponible.";
        }
    }

    public String devolver() {
        if (!disponible) {
            disponible = true;
            return "El libro '" + titulo + "' ha sido devuelto.";
        } else {
            return "El libro '" + titulo + "' ya está disponible.";
        }
    }

    public String estaDisponible() {
        return disponible ? "El libro '" + titulo + "' está disponible." : "El libro '" + titulo + "' no está disponible.";
    }
}
