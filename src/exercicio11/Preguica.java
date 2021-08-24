package exercicio11;

public class Preguica extends Animal{
    String acao;

    public Preguica(String nome, int idade, String som, String acao){
        super(nome, idade, som);
        this.acao = acao;
    }

    public void subirArvore(){
        System.out.println("Acao: " + this.acao);
    }
}
