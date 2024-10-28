// Clase Camara que hereda de Producto y representa una cámara con marca y modelo
public class Camara extends Producto {
    private String marca; // Marca de la cámara
    private String modelo; // Modelo de la cámara

    // Constructor de Camara
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Obtiene la marca de la cámara
    public String getMarca() {
        return marca;
    }

    // Obtiene el modelo de la cámara
    public String getModelo() {
        return modelo;
    }
}
