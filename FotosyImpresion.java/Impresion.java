// Clase Impresion que hereda de Producto y representa una impresión de fotos
public class Impresion extends Producto {
    private String color; // Color de la impresión
    private Foto[] fotos; // Arreglo de fotos en la impresión

    // Constructor de Impresion
    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Obtiene el color de la impresión
    public String getColor() {
        return color;
    }

    // Obtiene el arreglo de fotos de la impresión
    public Foto[] getFotos() {
        return fotos;
    }
}
