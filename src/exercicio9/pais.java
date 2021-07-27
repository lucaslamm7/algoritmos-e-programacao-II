package exercicio9;

import java.util.ArrayList;

public class pais {
    private String codISO;
    private String nome;
    private Integer pop;
    private Double dim;
    ArrayList<pais> fronteira = new ArrayList();

    public pais(String codISO, String nome, Double dim){
        this.codISO = codISO;
        this.nome = nome;
        this.dim = dim;
    }
    public String getCodISO(){
        return codISO;
    }
    public String getNome(){
        return nome;
    }
    public Integer getPop(){
        return pop;
    }
    public Double getDim(){
        return dim;
    }
    public void setCodISO(String codISO){
        this.codISO = codISO;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPop(Integer pop){
        this.pop = pop;
    }
    public void setDim(Double dim){
        this.dim = dim;
    }
    public boolean mesmoPais(pais pais2){
        if(this.codISO.equals(pais2.getCodISO())){
            return true;
        }else{
            return false;
        }
    }
    public boolean limitrofe(pais pais2){
        if(this.fronteira.contains(pais2)){
            return true;
        }else{
            return false;
        }
    }
    /*public void densidade(Double densidade){
        densidade = this.getPop()/this.getDim();
        return densidade;
    }*/
    public ArrayList<pais> vizinhosComuns(pais pais2){
        ArrayList<pais> comuns = new ArrayList();
        for(pais pais : this.fronteira){
            if(pais2.limitrofe(pais)){
                comuns.add(pais);
            }
        }
        return comuns;
    }
}
