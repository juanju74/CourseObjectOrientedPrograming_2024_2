import java.util.ArrayList;
import java.util.Date;

// Clase Pedido que representa un pedido realizado por un cliente, que incluye varios productos
public class Pedido {
    private Cliente cliente; // Cliente que hizo el pedido
    private ArrayList<Producto> productos; // Lista de productos en el pedido
    private Date fecha; // Fecha del pedido
    private int numeroTarjetaCredito; // Número de tarjeta de crédito

    // Constructor de Pedido
    public Pedido(Cliente cliente, Producto[] productosPedido1, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.productos = new ArrayList<>();
    }

    // Añade un producto al pedido
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
