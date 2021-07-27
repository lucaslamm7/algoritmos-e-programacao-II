package exercicio9;

import java.util.ArrayList;


public class continente {
    private String nome;
    private ArrayList<pais> paises = new ArrayList();

    public continente(String nome){
        this.nome = nome;
    }
    public void adicionaPais(pais novoPais){
        this.paises.add(novoPais);
    }
    public void dimTotal(pais pais){
        Double dimTotal = pais.getDim();
    }
    public void popTotal(pais pais){
        Integer popTotal = pais.getPop();
    }
}
