public class Salario {
	 
    public static void main(String[] args) {
        
    	//Cuentas con 500.000 de dinero inicial
    	
        Cuenta cuenta_1 = new Cuenta("Bill",500000);
        Cuenta cuenta_2 = new Cuenta("Fernando", 500000);
         
        //Pargo de Salario
        
        cuenta_1.ingresar(500000);
        cuenta_2.ingresar(500000);
         
        //Retiramos dinero en las cuentas
        
        //cuenta_1.retirar(200);
        //cuenta_2.retirar(100);
         
        //Muestro la informacion de las cuentas
        System.out.println("El empleado "+cuenta_1.getTitular()+" tiene  "+cuenta_1.getCantidad()+" en su cuenta de nomina"); 
        System.out.println("El empleado "+cuenta_2.getTitular()+" tiene "+cuenta_2.getCantidad()+"ena su cuenta de nomina"); 
         
    }
     
}