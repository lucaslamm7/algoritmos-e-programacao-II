package RevisaoProva;

import java.util.ArrayList;

public abstract class Veiculo {
    private int codigo;
    private int capacidade;
    private ArrayList<Passageiro> listaPassageirosNoOnibus = new ArrayList<>();
    private Linha linhaAtual;
    private int indiceParadaAtual;

    public void Veiculo(){
        this.indiceParadaAtual = 0;
    }
    public Parada proximaParada(){
        Parada paradaAtual = linhaAtual.getParada(this.indiceParadaAtual);
        this.indiceParadaAtual++;
        return paradaAtual;
    }
    public void adicionarAluno(Passageiro Aluno){
        this.listaPassageirosNoOnibus.add(Aluno);
    }
    public void removerAluno(){
        for(int i=0; i<this.listaPassageirosNoOnibus.size(); i++){
            if(this.listaPassageirosNoOnibus.get(i).getDestino() == this.proximaParada()){
                this.listaPassageirosNoOnibus.remove(i);
            }
            //System.out.println(this.listaPassageirosNoOnibus.get(i).getDestino());
            //System.out.println(this.proximaParada());
        }
    }

    public void imprimirPassageiros(){
        for(int i=0; i<this.listaPassageirosNoOnibus.size(); i++){
            System.out.println(this.listaPassageirosNoOnibus.get(i).toString());
        }
    }

    public void fazerRota(){
        this.proximaParada();
        this.removerAluno();
        this.imprimirPassageiros();
    }

    public void setCapacidade(int y){
        this.capacidade = y;
    }

    public void setLinha(Linha linha) {
        this.linhaAtual = linha;
    }
}
