package TrabajoFinal;

// Clase que representa la puerta del ascensor
public class Puerta {

    private boolean abierta;
    private String sonido;
    private String luces;
    private boolean sensor;
    private boolean estado;
    private BotonAscensor botonPuertaAscenor;

    public Puerta() {
        this.abierta = false;
        this.sonido = "pipipipi";
        this.luces = "luz apagada";
        this.sensor = false;
        this.estado = true;
        this.botonPuertaAscenor = new BotonAscensor(0);
    }

    // Método para abrir la puerta
    public String abrir() {
        String salida = "";
        if (!abierta) {
            abierta = true;
            sensor = true;
            this.setLuces("LUZ ENCENDIDA");
            salida = sonido + "\n" + luces + "\nLa puerta se ha abierto.";
        }
        return salida;
    }
    

    // Método para cerrar la puerta
    public String cerrar() {
        String salida = "";
        if (abierta) {
            abierta = false;
            sensor = false;
            this.setLuces("LUZ APAGADA");
            salida = sonido + "\n" + luces + "\nLa puerta se ha cerrado.";
        }
        return salida;
    }

    // Método para mantener la puerta abierta por más tiempo
    public String mantenerAbierta() {
        String salida = "";
        if (abierta) {
            salida = "La puerta se mantendrá abierta por más tiempo.";
        } else {
            salida = "Primero debe abrir la puerta.";
        }
        return salida;
    }

    public boolean isSensor() {
        return sensor;
    }

    public void setSensor(boolean sensor) {
        this.sensor = sensor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public BotonAscensor getBotonPuertaAscenor() {
        return botonPuertaAscenor;
    }

    public void setBotonPuertaAscenor(BotonAscensor botonPuertaAscenor) {
        this.botonPuertaAscenor = botonPuertaAscenor;
    }
}
