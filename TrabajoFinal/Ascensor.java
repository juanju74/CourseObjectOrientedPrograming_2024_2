package TrabajoFinal;

// Clase base para el ascensor, con control de movimiento y puertas
import static TrabajoFinal.Ejecutar.x;

public class Ascensor {

    private int pisoActual;
    private Puerta puerta;
    private boolean estado;

    public Ascensor() {
        this.pisoActual = 0;
        this.estado = true;
        this.puerta = new Puerta();
    }

    // Método para mover el ascensor a un piso destino
    public String moverA(int pisoDestino) {
        String salida = "";
        int opcion = 0;
        if (!puerta.isAbierta()) {
            pisoActual = pisoDestino;
            salida = "Ascensor en movimiento hacia el piso " + pisoDestino;

        } else {
            salida = "La puerta está abierta, cierre la puerta para continuar.";
        }
        return salida;
    }

    // Método para abrir la puerta del ascensor
    public String abrirPuerta() {
        return puerta.abrir();
    }

    // Método para cerrar la puerta del ascensor
    public String cerrarPuerta() {
        return puerta.cerrar();
    }

    // Método para mantener la puerta abierta
    public String mantenerPuertaAbierta() {
        return puerta.mantenerAbierta();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
