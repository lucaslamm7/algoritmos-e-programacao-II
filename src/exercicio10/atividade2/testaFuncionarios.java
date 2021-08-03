package exercicio10.atividade2;

public class testaFuncionarios {
    public static void main(String[] args) {
        gerente g = new gerente("Fulano", 5000.00,"fulano01", "123abc");
        telefonistas t = new telefonistas("Ciclana", 1200.00, 1);
        secretarias s = new secretarias("Beltrana", 1500.00, 203);

        System.out.println("GERENTE");
        g.mostrarDados();
        System.out.println("TELEFONISTA");
        t.mostrarDados();
        System.out.println("SECRETARIA");
        s.mostrarDados();
    }
}
