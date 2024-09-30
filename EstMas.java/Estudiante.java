public class Estudiante extends Persona {
    private double beca;

    public Estudiante(int id, String nombre, int edad, double beca) {
        super(id, nombre, edad); // Llama al constructor de la clase base (Persona)
        this.beca = beca;
    }

    public double getBeca() {
        return beca;
    }

    // Sobrescribimos el método salario
    @Override
    public double salario() {
        return beca; // El salario del estudiante es simplemente la beca
    }

    @Override
    public String toString() {
        return super.toString() + ", Beca=" + beca;
    }
}
