package exercicio10.atividade2;

import jdk.swing.interop.SwingInterOpUtils;

public class funcionario {
    private String nome;
    private double salario;

    public double calculaBonificacao(){
        return this.salario*0.1;
    }

    public funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    //GETTERS
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    //SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDados(){

    }
}
