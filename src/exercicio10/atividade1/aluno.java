package exercicio10.atividade1;

public class aluno extends pessoas{
    int matriculaAluno;

    public aluno(String nome, int idade, int matriculaAluno){
        super(nome, idade);
        this.matriculaAluno = matriculaAluno;
    }

    public void imprimir(){
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        System.out.println("MATRICULA: " + this.matriculaAluno);
    }
}
