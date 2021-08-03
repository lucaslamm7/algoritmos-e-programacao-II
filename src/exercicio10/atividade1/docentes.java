package exercicio10.atividade1;

public class docentes extends pessoas{
    int matriculaDocente;
    String materia;

    public docentes(String nome, int idade, int matriculaDocente, String materia){
        super(nome, idade);
        this.matriculaDocente = matriculaDocente;
        this.materia = materia;
    }

    public void imprimir(){
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        System.out.println("MATRICULA: " + this.matriculaDocente);
        System.out.println("MATERIA: " + this.materia);
    }


}
