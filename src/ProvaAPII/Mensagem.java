package ProvaAPII;

public class Mensagem {
    String titulo;
    String conteudo;

    public Mensagem(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String toString(){
        return "<" + this.titulo + "> - <" + this.conteudo + ">";
    }
}
