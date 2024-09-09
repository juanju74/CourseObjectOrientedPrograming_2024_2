import java.time.LocalDate;

public class Ejecutar {
    public static void main(String[] args) {
        ReservaHotel objReservaHotel = new ReservaHotel("Carlos Martínez", LocalDate.of(2024, 9, 15), LocalDate.of(2024, 9, 20), 101);
        System.out.println("Consultar reserva: " + ((Object) objReservaHotel).consultarReserva());
        System.out.println("Cancelar reserva: " + ((Object) objReservaHotel).cancelarReserva());
        System.out.println("Consultar después de cancelar: " + objReservaHotel.consultarReserva());
    }
}
