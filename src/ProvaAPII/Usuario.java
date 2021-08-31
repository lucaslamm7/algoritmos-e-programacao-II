package ProvaAPII;

import java.util.ArrayList;

public abstract class Usuario {
    String nome;
    ArrayList<Mensagem> listaMensagensRecebidas = new ArrayList<>();

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void receberMensagem(Mensagem msg){
        cadastrarMensagem(msg);
        imprimirMensagem();
    }

    public void cadastrarMensagem(Mensagem msg){
        this.listaMensagensRecebidas.add(msg);
    }
    public abstract void imprimirMensagem();
}
