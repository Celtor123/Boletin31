
package boletin31;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vendedor extends Empregado{
    Coche coche;
    int telefonoMobil,porcentaxe,ano;
   
    ArrayList<Cliente> cliente= new ArrayList<>();
    
   double salario,areaVenda;
   
    public Vendedor() {
    }

    public Vendedor(Coche coche, int telefonoMobil, int porcentaxe, int ano, double salario, double areaVenda,ArrayList <Cliente>cliente) {
        this.coche = coche;
        this.telefonoMobil = telefonoMobil;
        this.porcentaxe = porcentaxe;
        this.ano = ano;
        this.salario = salario;
        this.areaVenda = areaVenda;
        this.cliente=cliente;
    }

    

    public Coche getCoche() {
        return coche;
    }

    public void cambioCoche(Coche coche) {
        this.coche = coche;
    }

    public int getTelefonoMobil() {
        return telefonoMobil;
    }

    public void setTelefonoMobil(int telefonoMobil) {
        this.telefonoMobil = telefonoMobil;
    }

    public double getAreaVenta() {
        return areaVenda;
    }

    public void setAreaVenta(float areaVenta) {
        this.areaVenda = areaVenta;
    }

    public ArrayList<Cliente> darAltaCliente() {
        return cliente;
    }

    public void darBaixaaCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public int getPorcentaxe() {
        return porcentaxe;
    }

    public void setPorcentaxe(int porcentaxe) {
        this.porcentaxe = porcentaxe;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

    

  
      public void imprimir(){
       System.out.println("Vendedor{" + "coche=" + coche + ", telefonoMobil=" + telefonoMobil + ", porcentaxe=" + porcentaxe+", ano=" + ano+", salario=" + salario+", areaVenda=" + areaVenda + ", clientes=" + cliente + '}');   
        }                                                                      //coche,movil,porcentaxe,ano,salario,areaVenda,cliente
      

    @Override
    public void incrementarSalario(){
        ano=Integer.parseInt(JOptionPane.showInputDialog("Cantos anos leva este vendedor traballando"));
        this.salario=(((salario*12)+(ano*5/100))/12);
        this.salario=salario-(salario*porcentaxe/100);
        setSalario(salario);
    }
    }
// Ten coche da empresa (identificado por matricúlaa, marca e modelo), teléfono móbil, área de venda, lista de clientes
//e porcentaxe que leva das vendas en concepto de comisións. Incrementa o seu salario un 10% anual
// Terá, polo menos, as seguintes funciones membro:
// • Construtores (debe encher a información persoal e os datos principais)
// • Imprimir (debe imprimir os seus datos persoais e o seu posto na empresa).
// • Dar de alta un novo cliente.
// • Dar de baixa un cliente.
//-  Cambiar de coche.