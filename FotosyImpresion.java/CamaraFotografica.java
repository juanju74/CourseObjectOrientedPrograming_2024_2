public class CamaraFotografica extends Articulo {
    private String marca;
    private String modelo;

    public CamaraFotografica(int identificador, String marca, String modelo) {
        super(identificador);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

