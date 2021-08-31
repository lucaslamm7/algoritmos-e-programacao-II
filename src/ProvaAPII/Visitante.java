package ProvaAPII;

public class Visitante extends Usuario{
    String tipo;

    public Visitante(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        System.out.println("Visitante " + this.getNome() + ": Mensagem Recebida: "+ this.listaMensagensRecebidas.get(listaMensagensRecebidas.size()));
    }
}
