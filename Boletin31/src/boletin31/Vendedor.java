
package boletin31;

import javax.swing.JOptionPane;

public class Vendedor extends Empregado{
    int telefonoMobil;
    float areaVenta;
    String clientes;
    int porcentaxe;
   
    public Vendedor() {
    }

    public Vendedor(int telefonoMobil, float areaVenta, String clientes, int porcentaxe) {
        this.telefonoMobil = telefonoMobil;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
        this.porcentaxe = porcentaxe;
    }
    @Override
    public void imprimir(){
        System.out.println(telefonoMobil+areaVenta+clientes+porcentaxe);
    }
    @Override
    public void incrementarSalario(){
        ano=Integer.parseInt(JOptionPane.showInputDialog("Cantos anos leva este vendedor traballando"));
        this.salario=((salario*12)+(ano*5/100))/12;
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