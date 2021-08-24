package exercicio11;

public class Cachorro extends Animal{
    String acao;

    public Cachorro(String nome, int idade, String som, String acao){
        super(nome, idade, som);
        this.acao = acao;
    }

    public void correr(){
        System.out.println("Acao: " + this.acao);
    }
}
