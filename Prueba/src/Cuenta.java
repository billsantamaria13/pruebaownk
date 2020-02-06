public class Cuenta {
 
    //Atributos
	
    private String titular;
    private int cantidad;
 
    //Constructor
    
    public Cuenta(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
        
    }
 
    
    //Suma Salario
    
    public void ingresar(int cantidad) {
            this.cantidad += cantidad;   
    } 
    
    //Getters y Setters
    
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
        this.titular = titular;
    }
 
    public double getCantidad() {
        return cantidad;
    }
 
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 
 
}