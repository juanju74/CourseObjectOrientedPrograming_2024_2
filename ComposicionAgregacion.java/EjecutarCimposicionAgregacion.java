public class EjecutarCimposicionAgregacion {
    public static void main(String[] args) {
        Cliente objCliente1 = new Cliente(110668894, "juanitojuan", "hernesto");

        Cuenta objCuenta1= new Cuenta("7089738", "ahorros",0.0);
        
        Banco objBanco1 = new Banco("900345673","Banco UCC", objCuenta1);

        System.out.println(objBanco1);
    }
}