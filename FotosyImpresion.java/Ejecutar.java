import java.util.ArrayList;
import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {
        // usuarios
        Usuario usuario1 = new Usuario("0011223344", "Carlos Martínez");
        Usuario usuario2 = new Usuario("5566778899", "Sofía López");

        // se crea la  lista de órdenes
        ArrayList<Orden> listaOrdenes = new ArrayList<>();
        listaOrdenes.add(generarOrden(usuario1, new Date(), "1111-2222-3333-4444"));
        listaOrdenes.add(generarOrden(usuario2, new Date(), "5555-6666-7777-8888"));

        // se agregna los productos a las órdenes
        CamaraFotografica camaraSony = new CamaraFotografica(301, "Sony", "Alpha 7");
        Impresora impresoraEpson = new Impresora(401, "A Color");
        impresoraEpson.añadirImagen(new Imagen("paisaje.jpg"));
        impresoraEpson.añadirImagen(new Imagen("retrato.jpg"));

        listaOrdenes.get(0).añadirArticulo(camaraSony);
        listaOrdenes.get(0).añadirArticulo(impresoraEpson);

        CamaraFotografica camaraFujifilm = new CamaraFotografica(302, "Fujifilm", "X-T30");
        Impresora impresoraHP = new Impresora(402, "Blanco y Negro");
        impresoraHP.añadirImagen(new Imagen("foto_viaje.jpg"));
        impresoraHP.añadirImagen(new Imagen("foto_familia.jpg"));

        listaOrdenes.get(1).añadirArticulo(camaraFujifilm);
        listaOrdenes.get(1).añadirArticulo(impresoraHP);

        // se muestra lso detalles de las órdenes
        for (Orden orden : listaOrdenes) {
            imprimirDetallesOrden(orden);
        }
    }

    // EL metodo para generar una orden
    public static Orden generarOrden(Usuario usuario, Date fecha, String tarjetaCredito) {
        Orden nuevaOrden = new Orden(usuario, fecha, tarjetaCredito);
        System.out.println("Nueva orden registrada para: " + usuario.getNombreCompleto());
        return nuevaOrden;
    }

    // el metodo para mostrar los detalles de una orden
    public static void imprimirDetallesOrden(Orden orden) {
        System.out.println("\n--- Detalles de la Orden ---");
        System.out.println("Cliente: " + orden.getUsuario().getNombreCompleto());
        System.out.println("Fecha: " + orden.getFechaDeOrden());
        System.out.println("Número de Tarjeta: " + ocultarNumeroTarjeta(orden.getNumeroTarjeta()));
        System.out.println("Artículos en la Orden:");

        for (Articulo articulo : orden.getArticulos()) {
            if (articulo instanceof CamaraFotografica) {
                CamaraFotografica camara = (CamaraFotografica) articulo;
                System.out.println("- Cámara: " + camara.getMarca() + " " + camara.getModelo());
            } else if (articulo instanceof Impresora) {
                Impresora impresora = (Impresora) articulo;
                System.out.println("- Impresora: " + impresora.getTonalidad());
                for (Imagen imagen : impresora.getImagenes()) {
                    System.out.println("  * Imagen: " + imagen);
                }
            }
        }
    }

    // el metodo para ocultar parcialmente el número de tarjeta por la seguridad
    public static String ocultarNumeroTarjeta(String numeroTarjeta) {
        return "****-****-****-" + numeroTarjeta.substring(numeroTarjeta.length() - 4);
    }
}
