package exercicio11;

public class Cavalo extends Animal{
    String acao;

    public Cavalo(String nome, int idade, String som, String acao){
        super(nome, idade, som);
        this.acao = acao;
    }

    public void correr(){
        System.out.println("Acao: " + this.acao);
    }
}
