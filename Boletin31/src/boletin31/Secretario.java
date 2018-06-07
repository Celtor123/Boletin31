
package boletin31;

import javax.swing.JOptionPane;

public class Secretario extends Empregado{
    int numfax,ano;
    double salario;
   private Despacho despacho;
    public Secretario() {
    }

    public Secretario(int numfax, int ano, int salario, Despacho despacho) {
        this.numfax = numfax;
        this.ano = ano;
        this.salario = salario;
        this.despacho = despacho;
    }

    public int getNumfax() {
        return numfax;
    }

    public void setNumfax(int numfax) {
        this.numfax = numfax;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    
    public void imprimir() {
        System.out.print("Secretario{" + "numfax=" + numfax + ", ano=" + ano + ", salario=" + salario + ", despacho=" + despacho + '}');
    
    }

  
    
    

    
    
  
    @Override
    public void incrementarSalario(){
        ano=Integer.parseInt(JOptionPane.showInputDialog("Cantos anos leva este secretario traballando"));
        salario=((salario*12)+(ano*5/100))/12;
        setSalario(salario);
    }
//    Secretario. Ten despacho, número de fax e incrementa o seu salario un 5% anual.
// Terá, polo menos, as seguintes funciones membro:
// • Construtores (debe encher a información persoal e os datos principais)
// • Imprimir (debe imprimir os seus datos persoais e o seu posto na empresa).
    
    

  }
