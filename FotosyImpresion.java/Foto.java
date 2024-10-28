// Clase Foto que representa una foto con un fichero asociado
public class Foto {
    private String fichero; // Nombre o ruta del fichero de la foto

    // Constructor de Foto
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Obtiene el nombre o ruta del fichero de la foto
    public String getFichero() {
        return fichero;
    }

    // Establece un nuevo nombre o ruta para el fichero de la foto
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    // Muestra la foto imprimiendo un mensaje en la consola
    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }

    // Retorna una representación en cadena de la foto
    @Override
    public String toString() {
        return "Foto [Fichero: " + fichero + "]";
    }
}
