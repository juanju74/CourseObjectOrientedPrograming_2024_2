import java.util.ArrayList;

public class Impresora extends Articulo {
    private String tonalidad;
    private ArrayList<Imagen> imagenes;

    public Impresora(int identificador, String tonalidad) {
        super(identificador);
        this.tonalidad = tonalidad;
        this.imagenes = new ArrayList<>();
    }

    public void añadirImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }

    public String getTonalidad() {
        return tonalidad;
    }

    public void setTonalidad(String tonalidad) {
        this.tonalidad = tonalidad;
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
