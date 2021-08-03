package exercicio10.atividade2;

public class secretarias extends funcionario{
    private int ramal;

    public secretarias(String nome, double salario, int ramal){
        super(nome, salario);
        this.ramal = ramal;
    }
    public void mostrarDados(){
        System.out.println("NOME: "+this.getNome());
        System.out.println("SALARIO: "+this.getSalario());
        System.out.println("BONIFICACAO: "+this.calculaBonificacao());
        System.out.println("RAMAL: "+this.ramal);
    }

    //GETTERS
    public int getRamal(){
        return ramal;
    }
    //SETTERS
    /*
    private void setRamal(int ramal){
        this.ramal = ramal;
    }*/
}
