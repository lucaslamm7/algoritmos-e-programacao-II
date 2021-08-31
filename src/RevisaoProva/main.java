package RevisaoProva;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Parada p1 = new Parada("TK", "esquina da TK");
        Parada p2 = new Parada("Caixa D'agua", "caixa d'agua");
        Parada p3 = new Parada("Territorio", "rua do territorio");
        Passageiro pas1 = new Passageiro("Maria", p2, p2);
        Passageiro pas2 = new Passageiro("Eduardo", p1, p1);
        Passageiro pas3 = new Passageiro("Fernando", p1, p2);
        Passageiro pas4 = new Passageiro("Juliana", p3, p3);
        Passageiro pas5 = new Passageiro("Joana", p3,p3);

        Linha l1 = new Linha();
        l1.setNome("Centro");
        l1.setListaDeParadas(p1);
        l1.setListaDeParadas(p2);
        l1.setListaDeParadas(p3);

        Van Girus = new Van();
        Girus.Veiculo();
        Girus.setLinha(l1);
        Girus.adicionarAluno(pas1);
        Girus.adicionarAluno(pas2);
        Girus.adicionarAluno(pas3);
        Girus.adicionarAluno(pas4);
        Girus.adicionarAluno(pas5);
        Girus.fazerRota();


    }
}
