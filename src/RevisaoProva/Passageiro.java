package RevisaoProva;

import java.util.ArrayList;

public class Passageiro {
    private String nome;
    private Parada origem;
    private Parada destino;

    public Passageiro(String nome, Parada origem, Parada destino) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
    }

    public Parada getDestino(){
        return destino;
    }

    public String toString(){
        return "Aluno: " + this.nome + "; Origem: " + this.origem + "; Destino: " + this.destino;
    }
}
