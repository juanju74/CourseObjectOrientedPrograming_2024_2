// Clase abstracta Producto que representa un producto genérico
public abstract class Producto {
    private int numero; // Número de identificación del producto

    // Constructor de Producto
    public Producto(int numero) {
        this.numero = numero;
    }

    // Obtiene el número de identificación del producto
    public int getNumero() {
        return numero;
    }

    // Establece el número de identificación del producto
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
