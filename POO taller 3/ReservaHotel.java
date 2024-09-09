

import java.time.LocalDate;

public class ReservaHotel {

    // Atributos de la clase
    private String nombreCliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int numeroHabitacion;
    private boolean activa;

    // Método Constructor
    public ReservaHotel(String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, int numeroHabitacion) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        this.activa = true;
    }

    // Métodos de la clase

    public String consultarReserva() {
        if (activa) {
            return "Reserva para: " + nombreCliente + "\nFecha de entrada: " + fechaEntrada + 
                   "\nFecha de salida: " + fechaSalida + "\nNúmero de habitación: " + numeroHabitacion;
        } else {
            return "Esta reserva ha sido cancelada.";
        }
    }

    public String cancelarReserva() {
        if (activa) {
            activa = false;
            return "La reserva ha sido cancelada.";
        } else {
            return "La reserva ya estaba cancelada.";
        }
    }

    public String crearReserva(String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, int numeroHabitacion) {
        return "Nueva reserva para: " + nombreCliente + "\nNúmero de habitación: " + numeroHabitacion;
    }
}
