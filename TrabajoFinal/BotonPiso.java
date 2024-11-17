package TrabajoFinal;

public class BotonPiso extends Boton {
    private String direccion;

    public BotonPiso(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

   
    
    @Override
    public String accion() {
        return "Solicitud de " + direccion + " registrada desde el piso.";
    }
}