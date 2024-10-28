// Clase Cliente que representa un cliente con cédula y nombre
public class Cliente {
    private String cedula; // Cédula del cliente
    private String nombre; // Nombre del cliente

    // Constructor de Cliente
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Obtiene la cédula del cliente
    public String getCedula() {
        return cedula;
    }

    // Establece una nueva cédula para el cliente
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Obtiene el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Establece un nuevo nombre para el cliente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
