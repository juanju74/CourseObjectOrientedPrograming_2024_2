public class CalculoSalario {

    public static void main(String[] args) {
    calcularSalarioNeto();
   }  
 public static void calcularSalarioNeto () {
   

  System.out.println(" El empleado Juan Arboleda Gana de Salario Bruto 1.460.000 puesto que 1.300.000 son de salario base y 160,000 de auxilio transportes,Comisiones son 392.000 y deducciones son 104.000");
  
  //Inicializacion de variables
  int SalarioBase = 0;
  int Auxiliotransportes = 0;
  int Comisiones = 0;
  int deducciones = 0;
  int SalarioBruto = 0;
  int SalarioNeto = 0;

  //Asignar variables 
  SalarioBase=1300000;
  Auxiliotransportes = 160000;
  SalarioBruto = (SalarioBase + Auxiliotransportes) ;
  Comisiones = 392000;
  deducciones = 104000 ;
  System.out.println("El salario bruto es ="+SalarioBruto);
  SalarioNeto = ((SalarioBruto-deducciones)+Comisiones) ;
  System.out.println("El Salario Neto del trabajador Juan Arboleda es = "+SalarioNeto);
     
    }    
  }    
   
      
