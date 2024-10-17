public class Imagen {
    private String archivo;

    public Imagen(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void mostrar() {
        System.out.println("Mostrando imagen: " + archivo);
    }

    @Override
    public String toString() {
        return "Imagen [Archivo: " + archivo + ", ID: " + hashCode() + "]";
    }
}
