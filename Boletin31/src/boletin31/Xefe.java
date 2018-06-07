
package boletin31;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Xefe extends Empregado{
    private Despacho despacho;
    private Secretario secretario;
    private Coche coche;
  ArrayList <Vendedor> a= new ArrayList<>();

    public Xefe(Despacho despacho, Secretario secretario, Coche coche) {
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public ArrayList<Vendedor> getA() {
        return a;
    }

    public void setA(ArrayList<Vendedor> a) {
        this.a = a;
    }
    public void imprimir(){
        System.out.println(" Despacho"+despacho+" Secretario"+secretario+" Coche"+coche+" Vendedor"+a.toString());
    }
    

 

public void incrementarSalario(){
        ano=Integer.parseInt(JOptionPane.showInputDialog("Cantos anos leva este xefe traballando"));
        this.salario=((salario*12)+(ano*20/100))/12;
    }

  }
//Ten despacho, ten un secretario ao seu cargo, unha lista de vendedores ao seu cargo e ten coche da empresa (identificado pola matrícula, marca e modelo). Incrementa o seu salario un 20% anual
//. Terá, polo menos, as seguintes funciones membro:
// • Construtores (debe encher a información persoal e os datos principais)
// • Imprimir (debe imprimir os seus datos persoais e o seu posto na empresa). 
//• Cambiar de secretario.
// • Cambiar de coche.
//• Dar de alta e de baixa un novo vendedor na súa zona. 

