package exercicio8;

public class testaFuncionario {
    public static void main(String[] args) {
        funcionario f1 = new funcionario();
        data data = new data();
        //funcionario f2 = new funcionario();

        f1.nomeFuncionario = "Hugo";
        //f2.nomeFuncionario = "Hugo";
        f1.departamento = "B";
        f1.RG = "1117029973";
        f1.salario = 1000;
        f1.data = data;
        //f2.salario = 1000;
        f1.recebeAumento(500);

        funcionario f2 = f1;

        if(f1==f2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }

        f1.mostra();
        f2.mostra();

        //System.out.println("salario atual: "+ f1.salario);
        //System.out.println("salario anual: "+ f1.calculaGanhoAnual());
    }
}
