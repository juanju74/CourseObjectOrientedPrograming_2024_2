package TrabajoFinal;

public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    @Override
    public String accion() {
       return "Botón del piso " + pisoDestino + " presionado dentro del ascensor.";
    }
}