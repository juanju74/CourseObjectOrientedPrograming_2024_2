package TrabajoFinal;

public class Piso {

    //Atributos
    private int numero;
    private BotonPiso botonPiso;

    public Piso(int numero) {
        this.numero = numero;
        this.botonPiso = new BotonPiso("subida");

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BotonPiso getBotonPiso() {
        return botonPiso;
    }

    public void setBotonPiso(BotonPiso botonSubida) {
        this.botonPiso = botonSubida;
    }

    @Override
    public String toString() {
        return "Piso{" + "numero=" + numero + ", botonSubida=" + botonPiso + '}';
    }   
    
}
