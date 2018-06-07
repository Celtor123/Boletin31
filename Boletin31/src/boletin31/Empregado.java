
package boletin31;

import javax.swing.JOptionPane;

public class Empregado {
String nome, apelidos,direccion,DNI; 
        int teléfono;
        double salario;
 int ano;
    public Empregado() {
    }

    public Empregado(String nome, String apelidos, String direccion, String DNI, int teléfono, double salario) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.direccion = direccion;
        this.DNI = DNI;
        this.teléfono = teléfono;
        this.salario = salario;
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "nome"+nome+" apelidos"+apelidos+" direccion"+direccion+" DNI"+DNI+" teléfono"+teléfono+" salario"+salario);
    }
public void incrementarSalario(){
    
}
public class supervisor{
    
}
 
    public static void main(String[] args) {
     Empregado Emilio= new Empregado("Celso","Emilio_Ferreiro","Calle/Soubiñas,13","263792G",986326123,1200.03);
     Emilio.imprimir();
    }
    
}

//• Construtores para definir correctamente un empregado, a partir do seu nome, apelidos, DNI, dirección, teléfono e salario. 
//• Imprimir (amosa os datos )  
//• Cambiar supervisor
// • Incrementar salario
