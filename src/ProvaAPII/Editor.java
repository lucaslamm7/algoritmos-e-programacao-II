package ProvaAPII;

import java.util.ArrayList;

public class Editor {
    String nome;
    ArrayList<Usuario> listaSeguidores = new ArrayList<>();

    public Editor(String nome){
        this.nome = nome;
    }

    public void cadastrarSeguidor(Usuario usr){
        this.listaSeguidores.add(usr);
    }

    public void enviarMensagem(Mensagem msg){
        for(int i=0; i<listaSeguidores.size();i++){
            listaSeguidores.get(i).receberMensagem(msg);
        }
    }

}
