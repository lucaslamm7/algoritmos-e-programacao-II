package exercicio10.atividade1;

public class main {
    public static void main(String[] args) {
        aluno pessoa1 = new aluno("Lucas Lammel", 18, 2020007675);
        docentes pessoa2 = new docentes("Fulano", 30, 1010101010, "Geografia");
        tae pessoa3 = new tae("Beltrano", 29, "A", "I");

        pessoa1.imprimir();
        pessoa2.imprimir();
        pessoa3.imprimir();

        escola a = new escola();
        a.addPessoa(pessoa1);
        a.addPessoa(pessoa2);
        a.addPessoa(pessoa3);

    }
}
