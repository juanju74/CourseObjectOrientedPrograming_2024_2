public class Maestro extends Persona {
    private double salarioBase;
    private double bono;

    public Maestro(int id, String nombre, int edad, double salarioBase, double bono) {
        super(id, nombre, edad); // Llama al constructor de la clase base (Persona)
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBono() {
        return bono;
    }

    // Sobrescribimos el método salario
    @Override
    public double salario() {
        return salarioBase + bono; // El salario es el salario base más un bono
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario Base=" + salarioBase + ", Bono=" + bono;
    }
}
