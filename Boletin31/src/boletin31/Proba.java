
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
//
//// ahora Secretario
//Secretario Umberto= new Secretario(1,1,3,null);
//Umberto.imprimir();
//Despacho a1= new Despacho("El de la izquierda última columna");
//Umberto.setDespacho(a1);
//Umberto.imprimir();
//Umberto.incrementarSalario();//Mirar esto si se repite
//Umberto.imprimir();

//ahora Vendedor
Vendedor julio = new Vendedor(null,986345234,234,4,6,678,null);
julio.imprimir();
Coche y= new Coche("2345fhg","Ferrari","Custom/3CDI");
julio.cambioCoche(y);
julio.cambiarSupervisor(b);
julio.imprimir();
Cliente ayo= new Cliente("Yosh");
julio.darAltaCliente(ayo);
Coche i= new Coche("2735tjr","Chevrolet","Hardley/47dhb26");
julio.cambioCoche(i);
julio.cambiarSupervisor(a);
julio.incrementarSalario();
julio.imprimir();
julio.darBaixaaCliente(ayo);
julio.imprimir();

    }    
       
}
