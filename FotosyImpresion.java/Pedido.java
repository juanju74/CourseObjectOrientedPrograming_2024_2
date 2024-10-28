// Importa las clases necesarias para manejar listas y fechas
import java.util.ArrayList;
import java.util.Date;

// Clase Pedido que representa un pedido realizado por un cliente
public class Pedido {
    private Cliente cliente; // Cliente que hizo el pedido
    private ArrayList<Producto> productos; // Lista de productos en el pedido
    private Date fecha; // Fecha del pedido
    private int numeroTarjetaCredito; // Número de tarjeta de crédito asociado al pedido

    // Constructor de Pedido que inicializa los atributos con los valores proporcionados
    public Pedido(Cliente cliente, Producto[] productosPedido1, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente; // Asigna el cliente del pedido
        this.fecha = fecha; // Asigna la fecha del pedido
        this.numeroTarjetaCredito = numeroTarjetaCredito; // Asigna el número de tarjeta de crédito
        this.productos = new ArrayList<>(); // Inicializa la lista de productos

        // Agrega cada producto del arreglo a la lista 'productos'
        for (Producto producto : productosPedido1) {
            this.productos.add(producto);
        }
    }

    // Método para añadir un producto adicional al pedido
    public void añadirProducto(Producto producto) {
        this.productos.add(producto);
    }

    // Obtiene el cliente que realizó el pedido
    public Cliente getCliente() {
        return cliente;
    }

    // Obtiene la lista de productos del pedido
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Obtiene la fecha del pedido
    public Date getFecha() {
        return fecha;
    }

    // Obtiene el número de tarjeta de crédito asociado al pedido
    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }
}
