package ProvaAPII;

public class Docente extends Usuario{
    String tipo;

    public Docente(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        System.out.println("Docente " + this.getNome() + ": Mensagem Recebida: "+ this.listaMensagensRecebidas.get(listaMensagensRecebidas.size()-1));
    }
}
