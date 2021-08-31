package RevisaoProva;

import java.util.ArrayList;

public class Parada {
    private String nome;
    private String endereco;

    public Parada(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }
}
