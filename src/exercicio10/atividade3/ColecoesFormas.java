package exercicio10.atividade3;

import java.util.ArrayList;

public class ColecoesFormas {
    ArrayList<Forma> lista;

    ColecoesFormas(){
        this.lista = new ArrayList<Forma>();
    }

    public void adcFormas(Forma forma){
        this.lista.add(forma);
    }

    public void print(){
        System.out.println("A seguir todas as formas: ");
        for(Forma f : this.lista){
            System.out.println(f);
        }
    }



}
