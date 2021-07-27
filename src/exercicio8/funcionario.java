package exercicio8;

class funcionario {
    String nomeFuncionario;
    String departamento;
    String RG;
    data data;
    double salario;

    void recebeAumento(double aumento){
        salario = salario+aumento;
    }

    double calculaGanhoAnual(){
        double n = salario*12;
        return n;
    }
    void mostra(){
        System.out.println("Nome: "+ this.nomeFuncionario);
        System.out.println("Departamento: "+ this.departamento);
        System.out.println("Data de ingresso: "+ this.data);
        System.out.println("RG: "+ this.RG);
        System.out.println("Salario: "+this.salario);
        System.out.println("Ganho anual: "+this.calculaGanhoAnual());
    }
}
class data {
    int dia;
    int mes;
    int ano;

    void dataFormatada(){
        String dataDeEntrada = (dia+"/"+mes+"/"+ano);
    }
}



