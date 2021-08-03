package exercicio10.atividade2;

public class gerente extends funcionario{
    private String usuario;
    private String senha;

    public double calculaBonificacao(){
        return this.getSalario()*0.6+100;
    }

    public gerente(String nome, double salario, String usuario, String senha){
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }
    public void mostrarDados(){
        System.out.println("NOME: "+this.getNome());
        System.out.println("SALARIO: "+this.getSalario());
        System.out.println("BONIFICACAO: "+this.calculaBonificacao());
        System.out.println("USUARIO: "+this.usuario);
        System.out.println("SENHA: "+this.senha);
    }
    //GETTERS
    public String getUsuario(){
        return usuario;
    }
    public String getSenha(){
        return senha;
    }
    //SETTERS
    /*
    private void setUsuario(String usuario){
        this.usuario = usuario;
    }
    private void setSenha(String senha){
        this.senha = senha;
    }*/

}


