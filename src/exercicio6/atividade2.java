package exercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

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

        Collections.sort(nomes);

        for(int i = 0; i< nomes.size(); i++) {
            System.out.println((i + 1) + ") " + nomes.get(i));
        }
    }
}
