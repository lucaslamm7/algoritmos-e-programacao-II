package exercicio10.atividade2;

public class telefonistas extends funcionario {
    private int estacaoDeTrabalho;

    public telefonistas(String nome, double salario, int estacaoDeTrabalho) {
        super(nome, salario);
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
    public void mostrarDados(){
        System.out.println("NOME: "+this.getNome());
        System.out.println("SALARIO: "+this.getSalario());
        System.out.println("BONIFICACAO: "+this.calculaBonificacao());
        System.out.println("ESTACAO DE TRABALHO: "+this.estacaoDeTrabalho);
    }

    //GETTERS
    public int getEstacaoDeTrabalho(){
        return estacaoDeTrabalho;
    }
    //SETTERS
    /*
    private void setEstacaoDeTrabalho(int estacaoDeTrabalho){
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }*/
}
