public class Perfume {

    // Atributos de la clase
    private String nombre;
    private String marca;
    private double capacidad; // en mililitros
    private double precio;

    // Método Constructor
    public Perfume(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    // Métodos de la clase

    public String aplicarPerfume(double cantidad) {
        if (cantidad > 0 && cantidad <= capacidad) {
            capacidad -= cantidad;
            return "Aplicaste " + cantidad + " ml de perfume. Cantidad restante: " + capacidad + " ml.";
        } else {
            return "Cantidad no válida o insuficiente.";
        }
    }

    public String consultarCantidadRestante() {
        return "La cantidad restante es: " + capacidad + " ml.";
    }

    public String ajustarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
            return "El nuevo precio es: $" + precio;
        } else {
            return "El precio no puede ser negativo.";
        }
    }
}
