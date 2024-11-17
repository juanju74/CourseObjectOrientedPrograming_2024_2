package TrabajoFinal;

// Clase que gestiona el sistema de control del ascensor
public class SistemaControl {

    private Ascensor ascensor;
    private Piso[] pisos;

    // Constructor para inicializar el sistema de control con el tipo de ascensor adecuado
    public SistemaControl(int numPisos) {
        this.ascensor = new Ascensor();
        this.pisos = new Piso[numPisos];
        for (int i = 0; i < numPisos; i++) {
            pisos[i] = new Piso(i + 1);
        }
    }

    public void crearAlerta(int tipoAlerta, int numPiso) {
        if (tipoAlerta == 1) {
            this.getPisos()[numPiso].getBotonPiso().setEstado(false);
        }else if(tipoAlerta==2){
            ascensor.getPuerta().setEstado(false);
        }else if(tipoAlerta==3){
            ascensor.setEstado(false);
        }
    }

    // Método para mover el ascensor a un piso específico
    public String moverAscensor(int pisoDestino, String direccion) {
        String salida = "";
        if (ascensor.getPisoActual() != pisoDestino) {
            if (direccion.equalsIgnoreCase("subir")) {
                if (pisoDestino > ascensor.getPisoActual()) {
                    if (!ascensor.getPuerta().isAbierta()) {
                        salida = ascensor.moverA(pisoDestino) + "\n" + ascensor.abrirPuerta();

                    } else {
                        salida = ascensor.cerrarPuerta() + "\n" + ascensor.moverA(pisoDestino) + "\n" + ascensor.abrirPuerta();
                    }
                } else {
                    salida = "No puedes subir a un piso que este por debajo del actual\nTal vez buscas bajar";
                }
            } else {
                if (pisoDestino < ascensor.getPisoActual()) {
                    if (!ascensor.getPuerta().isAbierta()) {
                        salida = ascensor.moverA(pisoDestino) + "\n" + ascensor.abrirPuerta();
                    } else {
                        salida = ascensor.cerrarPuerta() + "\n" + ascensor.moverA(pisoDestino) + "\n" + ascensor.abrirPuerta();
                    }
                } else {
                    salida = "No puedes bajar a un piso que este por encima del actual\nTal vez buscas subir";
                }
            }
        } else {
            salida = ascensor.abrirPuerta() + "\n" + ascensor.cerrarPuerta();
        }
        return salida;
    }


    public String presionarBotonPiso(int piso, String direccion) {
        String salida = "";
            if (pisos[piso].getBotonPiso().isEstado()) {
                salida = pisos[piso].getBotonPiso().presionar() + "\n" + pisos[piso].getBotonPiso().accion();
            }
        return salida;
    }

    // Método para gestionar la solicitud dentro del ascensor
    public String presionarBotonAscensor(int pisoDestino) {
        BotonAscensor boton = new BotonAscensor(pisoDestino);
        return boton.presionar() + "\n" + boton.accion();
    }

    // Método para mantener la puerta abierta
    public String mantenerPuertaAbierta() {
        return ascensor.mantenerPuertaAbierta();
    }

    public Ascensor getAscensor() {
        return ascensor;
    }

    public void setAscensor(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    public Piso[] getPisos() {
        return pisos;
    }

    public void setPisos(Piso[] pisos) {
        this.pisos = pisos;
    }

}
