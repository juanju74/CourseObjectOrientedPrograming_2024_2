import java.util.ArrayList;
import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("123456789", "Ana Gómez");
        Usuario usuario2 = new Usuario("987654321", "Luis Pérez");

        // Crear órdenes
        ArrayList<Orden> ordenes = new ArrayList<>();
        ordenes.add(crearOrden(usuario1, new Date(), "1234-5678-9012-3456"));
        ordenes.add(crearOrden(usuario2, new Date(), "6543-2109-8765-4321"));

        // Agregar productos a las órdenes
        CamaraFotografica camara1 = new CamaraFotografica(101, "Canon", "EOS Rebel T7");
        Impresora impresora1 = new Impresora(201, "Color");
        impresora1.añadirImagen(new Imagen("foto1.jpg"));
        impresora1.añadirImagen(new Imagen("foto2.jpg"));

        ordenes.get(0).añadirArticulo(camara1);
        ordenes.get(0).añadirArticulo(impresora1);

        CamaraFotografica camara2 = new CamaraFotografica(102, "Nikon", "D3500");
        Impresora impresora2 = new Impresora(202, "Blanco y Negro");
        impresora2.añadirImagen(new Imagen("foto3.jpg"));
        impresora2.añadirImagen(new Imagen("foto4.jpg"));

        ordenes.get(1).añadirArticulo(camara2);
        ordenes.get(1).añadirArticulo(impresora2);

        // Mostrar detalles de las órdenes
        for (Orden orden : ordenes) {
            mostrarDetallesOrden(orden);
        }
    }

    public static Orden crearOrden(Usuario usuario, Date fecha, String numeroTarjeta) {
        Orden orden = new Orden(usuario, fecha, numeroTarjeta);
        System.out.println("Orden creada para: " + usuario.getNombreCompleto());
        return orden;
    }

    public static void mostrarDetallesOrden(Orden orden) {
        System.out.println("\nDetalles de la orden para " + orden.getUsuario().getNombreCompleto() + ":");
        System.out.println("Fecha: " + orden.getFechaDeOrden());
        System.out.println("Tarjeta: " + orden.getNumeroTarjeta());
        System.out.println("Artículos:");
        for (Articulo articulo : orden.getArticulos()) {
            if (articulo instanceof CamaraFotografica) {
                CamaraFotografica camara = (CamaraFotografica) articulo;
                System.out.println("- Cámara: " + camara.getMarca() + " " + camara.getModelo());
            } else if (articulo instanceof Impresora) {
                Impresora impresora = (Impresora) articulo;
                System.out.println("- Impresora: " + impresora.getTonalidad());
                for (Imagen imagen : impresora.getImagenes()) {
                    System.out.println("  * " + imagen);
                }
            }
        }
    }
}
