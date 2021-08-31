package ProvaAPII;

public class Tecnico extends Usuario{
    String tipo;

    public Tecnico(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        System.out.println("Tecnico " + this.getNome() + ": Mensagem Recebida: "+ this.listaMensagensRecebidas.get(listaMensagensRecebidas.size()));
    }
}
