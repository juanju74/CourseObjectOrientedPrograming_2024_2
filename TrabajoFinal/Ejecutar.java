package TrabajoFinal;

import java.util.Scanner;

public class Ejecutar {

    static final Scanner x = new Scanner(System.in);

    public static SistemaControl sistema = new SistemaControl(10);

    public static void main(String[] args) {

        int opccion = 0;

        do {
            System.out.println("SELECCIONE PISO DE INICIO ");
            int numPiso = x.nextInt();
            System.out.println("DESEA SUBIR O BAJAR?");
            String direccion = x.next();
            System.out.println(sistema.presionarBotonPiso(numPiso, direccion));
            ///meter la alerta 
            crearAlerta(numPiso);
            if (sistema.getAscensor().isEstado() && sistema.getAscensor().getPuerta().isEstado() && sistema.getPisos()[numPiso].getBotonPiso().isEstado()) {
                System.out.println(sistema.moverAscensor(numPiso, direccion));
                System.out.println(sistema.getAscensor().getPuerta().cerrar());
                System.out.print("SELECCIONA EL PISO DE DESTINO: ");
                int pisoDest = x.nextInt();
                System.out.println(sistema.presionarBotonAscensor(pisoDest));
                System.out.println(sistema.moverAscensor(pisoDest, direccion));
            }else{
                System.out.println("NO SE PUEDE REALIZAR EL VIAJE DEBIDO A QUE HAY UNA ALERTA EXISTENTE");
                return;
            }
            sistema.mantenerPuertaAbierta();
            System.out.println("DESEA REALIZAR OTRO VIAJE?\n1.SI\n2.NO");
            opccion = x.nextInt();

        } while (opccion != 2);
    }

    public static void crearAlerta(int numPiso) {
        System.out.println("DESEA REALIZAR UNA ALERTA?\n1.SI\n2.NO");
        int opAlert = x.nextInt();
        if (opAlert == 1) {
            System.out.println("SELECCIONE EL OBJETO SOBRE EL CUAL DESEA REALIZAR LA ALERTE:\n1.BOTON 2. PUERTA 3. ASCENSOR");
            int tipoAlerta = x.nextInt();
            sistema.crearAlerta(tipoAlerta, numPiso);
        }
    }
}
