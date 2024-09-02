public class Ejecutar{
    public static void main(String[] args){
        
        //Comentarios de una sola linea

        /*
         * Comentario de 
         * varias 
         * lineas
         */

        //JAVA la asignacion es con el "=" (igual)
        // a = 5 -> un 5 a la variabe a
        //b = 10 -> un 10 a la variable b
        //nombre = "Cristiano" cadena de texto "Cristiano" a a variable nombre
        // == -> es de comparación
        //Tener cuidado que las variables tienen un tipo de dato
        
        /*
         * Tipos de datos en JAVA
         * numericos --> (enteros int, long (reales) float, double (decimales))
         * Lógicos
         * 
         */

        /********************************************************************* */

        //Creación del objeto
        Marcador objMarcador1 = new Marcador("edding", "rojo", 1.2, true);
        System.out.println(objMarcador1.toString());
        objMarcador1.rayar();
        System.out.println(objMarcador1.recargar(10.0));
        
    }

}
