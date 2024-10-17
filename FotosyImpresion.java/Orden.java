import java.util.ArrayList;
import java.util.Date;

public class Orden {
    private Usuario usuario;
    private ArrayList<Articulo> articulos;
    private Date fechaDeOrden;
    private String numeroTarjeta;

    public Orden(Usuario usuario, Date fechaDeOrden, String numeroTarjeta) {
        this.usuario = usuario;
        this.fechaDeOrden = fechaDeOrden;
        this.numeroTarjeta = numeroTarjeta;
        this.articulos = new ArrayList<>();
    }

    public void añadirArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public Date getFechaDeOrden() {
        return fechaDeOrden;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
}
