public class Ejecutar4 {
    public static void main(String[] args) {
        // Creamos un maestro
        Persona maestro = new Maestro(1, "Carlos", 45, 2000.0, 500.0);

        // Creamos un estudiante
        Persona estudiante = new Estudiante(2, "María", 20, 1000.0);

        // Creamos un array de personas
        Persona[] personas = new Persona[2];
        personas[0] = maestro;
        personas[1] = estudiante;

        // Imprimimos los salarios
        for (int i = 0; i < personas.length; i++) {
            System.out.println("El salario de " + personas[i].getNombre() + " es: " + personas[i].salario());
        }
    }
}
