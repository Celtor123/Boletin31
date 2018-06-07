
package boletin31;

import javax.swing.JOptionPane;

public class Empregado {
  String nome, apelidos,direccion,DNI; 
        int teléfono;
        double salario;
        private Supervisor supervisor;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void imprimir(){
       System.out.print("Empregado{" + "nome=" + nome + ", apelidos=" + apelidos + ", direccion=" + direccion + ", DNI=" + DNI + ", tel\u00e9fono=" + teléfono + ", salario=" + salario + ", supervisor=" + supervisor + ", ano=" + ano + '}');
        }
public void incrementarSalario(){
    
}

public void cambiarSupervisor(Supervisor supervisor){
    this.supervisor=supervisor;
}

 
   
    
}

//• Construtores para definir correctamente un empregado, a partir do seu nome, apelidos, DNI, dirección, teléfono e salario. 
//• Imprimir (amosa os datos )  
//• Cambiar supervisor*2
// • Incrementar salario
