package ProvaAPII;

public class Aluno extends Usuario{
    String tipo;

    public Aluno(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        System.out.println("Aluno " + this.getNome() + ": Mensagem Recebida: "+ this.listaMensagensRecebidas.get(listaMensagensRecebidas.size()-1));
    }
}
