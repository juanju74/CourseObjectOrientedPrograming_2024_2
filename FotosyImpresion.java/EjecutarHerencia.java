import java.util.Date;

public class EjecutarHerencia {
    public static void main(String[] args) {

        // Crear objetos de Cliente
        Cliente cliente1 = new Cliente("123456", "Manuel Figueroa");
        Cliente cliente2 = new Cliente("654321", "Julio Martinez");

        // Crear objetos de Foto para las impresiones de ambos clientes
        Foto[] fotosImpresion1 = {
            new Foto("foto1.jpg"),
            new Foto("foto2.jpg")
        };

        Foto[] fotosImpresion2 = {
            new Foto("foto3.jpg"),
            new Foto("foto4.jpg")
        };

        // Crear objetos de Producto como Camara e Impresion para ambos clientes
        Producto camara1 = new Camara(1, "Canon", "EOS R5");
        Producto impresion1 = new Impresion(2, "Color", fotosImpresion1);

        Producto camara2 = new Camara(3, "Nikon", "Z6 II");
        Producto impresion2 = new Impresion(4, "Blanco y Negro", fotosImpresion2);

        // Crear arreglos de productos para los pedidos de ambos clientes
        Producto[] productosPedido1 = { camara1, impresion1 };
        Producto[] productosPedido2 = { camara2, impresion2 };

        // Crear objetos de Pedido para ambos clientes
        Pedido pedido1 = new Pedido(cliente1, productosPedido1, new Date(), 12345678);
        Pedido pedido2 = new Pedido(cliente2, productosPedido2, new Date(), 87654321);

        // Imprimir información de cada pedido
        System.out.println("Pedido 1:");
        imprimirInformacionPedido(pedido1);

        System.out.println("\nPedido 2:");
        imprimirInformacionPedido(pedido2);
    }

    // Método para imprimir la información de un pedido
    private static void imprimirInformacionPedido(Pedido pedido) {
     
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Productos en el pedido:");

        for (Producto producto : pedido.getProductos()) {
            if (producto instanceof Camara) {
                Camara camara = (Camara) producto;
                System.out.println("- Cámara: " + camara.getMarca() + " " + camara.getModelo());
            } else if (producto instanceof Impresion) {
                Impresion impresion = (Impresion) producto;
                System.out.println("- Impresión color: " + impresion.getColor());
                System.out.println("  Fotos incluidas:");
                for (Foto foto : impresion.getFotos()) {
                    foto.print();
                }
            }
        }

        System.out.println("Fecha del pedido: " + pedido.getFecha());
        System.out.println("Número de Tarjeta de Crédito: " + pedido.getNumeroTarjetaCredito());
    }
}
