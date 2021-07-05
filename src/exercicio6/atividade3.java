package exercicio6;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String remover;

        ArrayList<String> nomes = new ArrayList();

        nomes.add("Lionel Messi");
        nomes.add("Cristiano Ronaldo");
        nomes.add("Robert Lewandowski");
        nomes.add("Kevin De Bruyne");
        nomes.add("Neymar Jr");
        nomes.add("Jan Oblak");
        nomes.add("Virgil van Dijk");
        nomes.add("Mohamed Salah");
        nomes.add("Sadio Mané");
        nomes.add("Alisson Becker");

        System.out.println("Digite o nome que deseja excluir da lista ou digite 'clear' para limpar a lista inteira.\nDigite 'exit' para parar o programa.");
        remover = ler.nextLine();
        remover.toLowerCase();

        while(remover.equals("exit") == false) {

            if (remover.equals("clear")) {
                nomes.clear();
                System.out.println("Lista limpa!");
            } else if (nomes.indexOf(remover) >= 0) {
                nomes.remove(nomes.indexOf(remover));
                System.out.println(remover + " foi removido da lista!");
            } else {
                System.out.println("Nome nao existe na lista");
            }
            System.out.println("Digite o nome que deseja excluir da lista ou digite 'clear' para limpar a lista inteira.\nDigite 'exit' para parar o programa.");
            remover = ler.nextLine();
        }
        for(int i=0; i< nomes.size(); i++){
            System.out.println((i+1) + ") "+nomes.get(i));
        }
    }
}
