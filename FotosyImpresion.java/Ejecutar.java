package arraylistScanner;
import java.util.ArrayList;
import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {
        // Crear clientes y pedidos predefinidos
        Cliente cliente1 = new Cliente("123456789", "Ana Gómez");
        Cliente cliente2 = new Cliente("987654321", "Luis Pérez");

        // Crear una lista de pedidos
        ArrayList<Pedido> pedidos = new ArrayList<>();

        // Creación automática de pedidos con productos predefinidos
        pedidos.add(crearPedido(cliente1, new Date(), "1234-5678-9012-3456"));
        pedidos.add(crearPedido(cliente2, new Date(), "6543-2109-8765-4321"));

        // Agregar productos predefinidos a cada pedido
        Camara camara1 = crearCamara(101, "Canon", "EOS Rebel T7");
        Impresion impresion1 = crearImpresion(201, "Color");
        agregarFotoAImpresion(impresion1, "foto1.jpg");
        agregarFotoAImpresion(impresion1, "foto2.jpg");

        pedidos.get(0).addProducto(camara1);
        pedidos.get(0).addProducto(impresion1);

        Camara camara2 = crearCamara(102, "Nikon", "D3500");
        Impresion impresion2 = crearImpresion(202, "Blanco y Negro");
        agregarFotoAImpresion(impresion2, "foto3.jpg");
        agregarFotoAImpresion(impresion2, "foto4.jpg");

        pedidos.get(1).addProducto(camara2);
        pedidos.get(1).addProducto(impresion2);

        // Mostrar detalles de los pedidos creados
        for (Pedido pedido : pedidos) {
            mostrarDetallesPedido(pedido);
        }
    }

    // Método para crear un cliente
    public static Cliente crearCliente(String cedula, String nombre) {
        Cliente cliente = new Cliente(cedula, nombre);
        System.out.println("Cliente creado: " + nombre);
        return cliente;
    }

    // Método para crear un pedido
    public static Pedido crearPedido(Cliente cliente, Date fecha, String numeroTarjetaCredito) {
        Pedido pedido = new Pedido(cliente, fecha, numeroTarjetaCredito);
        System.out.println("Pedido creado para el cliente: " + cliente.getNombre());
        return pedido;
    }

    // Método para crear una cámara
    public static Camara crearCamara(int numero, String marca, String modelo) {
        Camara camara = new Camara(numero, marca, modelo);
        System.out.println("Cámara creada: Marca " + marca + ", Modelo " + modelo);
        return camara;
    }

    // Método para crear una impresión
    public static Impresion crearImpresion(int numero, String color) {
        Impresion impresion = new Impresion(numero, color);
        System.out.println("Impresión creada: Número " + numero + ", Color " + color);
        return impresion;
    }

    // Método para agregar una foto a una impresión
    public static void agregarFotoAImpresion(Impresion impresion, String fichero) {
        Foto foto = new Foto(fichero);
        impresion.addFoto(foto);
        System.out.println("Foto agregada a la impresión: " + fichero);
    }

    // Método para mostrar los detalles de un pedido
    public static void mostrarDetallesPedido(Pedido pedido) {
        System.out.println("\nDetalles del pedido para el cliente " + pedido.getCliente().getNombre() + ":");
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Número de tarjeta de crédito: " + pedido.getNumeroTarjetaCredito());
        System.out.println("Productos en el pedido:");

        for (Producto producto : pedido.getProductos()) {
            if (producto instanceof Impresion) {
                Impresion impresion = (Impresion) producto;
                System.out.println("- Impresión (Número: " + impresion.getNumero() + ", Color: " + impresion.getColor() + ")");
                for (Foto foto : impresion.getFotos()) {
                    System.out.println("  * Foto: " + foto);
                }
            } else if (producto instanceof Camara) {
                Camara camara = (Camara) producto;
                System.out.println("- Cámara (Número: " + camara.getNumero() + ", Marca: " + camara.getMarca() + ", Modelo: " + camara.getModelo() + ")");
            }
        }
    }
}
