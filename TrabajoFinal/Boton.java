package TrabajoFinal;
// Clase base para botones en el sistema de control de ascensores

public abstract class Boton {

    private boolean presionado;
    private boolean estado;

    public Boton() {
        this.presionado = false;
        this.estado = true;
    }

    // Método para presionar el botón
    public String presionar() {
        this.presionado = true;
        return "Boton precionado";
    }

    // Método abstracto que será implementado por las subclases
    public abstract String accion();

    public boolean isPresionado() {
        return presionado;
    }

    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
