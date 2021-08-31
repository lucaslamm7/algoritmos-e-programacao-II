package RevisaoProva;

import java.util.ArrayList;

public class Linha {
    private String nome;
    private ArrayList<Parada> listaDeParadas = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaDeParadas(Parada parada) {
        this.listaDeParadas.add(parada);
    }

    public Parada getParada(int x){
        return this.listaDeParadas.get(x);
    }

    public ArrayList<Parada> getListaDeParadas(){
        return listaDeParadas;
    }

}


