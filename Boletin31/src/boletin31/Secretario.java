
package boletin31;

import javax.swing.JOptionPane;

public class Secretario extends Empregado{
    int despacho,numfax,ano,salario;
   
    public Secretario() {
    }

    public Secretario(int despacho, int numfax, int salario) {
        this.despacho = despacho;
        this.numfax = numfax;
        this.salario = salario;
    }

    
    @Override
    public void imprimir(){
        System.out.println(numfax+salario+despacho);
    }
  
    @Override
    public void incrementarSalario(){
        ano=Integer.parseInt(JOptionPane.showInputDialog("Cantos anos leva este vendedor traballando"));
        this.salario=((salario*12)+(ano*5/100))/12;
    }
//    Secretario. Ten despacho, número de fax e incrementa o seu salario un 5% anual.
// Terá, polo menos, as seguintes funciones membro:
// • Construtores (debe encher a información persoal e os datos principais)
// • Imprimir (debe imprimir os seus datos persoais e o seu posto na empresa).
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

  }
