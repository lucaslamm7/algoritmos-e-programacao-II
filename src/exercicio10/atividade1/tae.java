package exercicio10.atividade1;

public class tae extends pessoas {
    String classe;
    String nivel;

    public tae(String nome, int idade, String classe, String nivel){
        super(nome, idade);
        this.classe = classe;
        this.nivel = nivel;
    }

    public void imprimir(){
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        System.out.println("CLASSE: " + this.classe);
        System.out.println("NIVEL: " + this.nivel);
    }
}
