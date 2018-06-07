
package boletin31;
public class Proba {
    
    
    
 public static void main(String[] args) {
 //Probamos con Empregado
    Empregado Emilio= new Empregado("Celso Emilio","Ferreiro","calle sotavento/13","8567143T",986253724,1040.34);
Emilio.imprimir();
 Supervisor a= new Supervisor("Gonza"); 
Emilio.cambiarSupervisor(a);
Emilio.imprimir();
Supervisor b= new Supervisor("Jose"); 
Emilio.cambiarSupervisor(b);
Emilio.imprimir();

// ahora Proba

    }    
       
}
