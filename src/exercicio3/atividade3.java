package exercicio3;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome = new String();

        nome = ler.next();

        StringBuilder iniciais = new StringBuilder();
        for (String parte: nome.split("(?i)\\s+(d[aeo]s?)\\s+")) {
            iniciais.append(Character.toUpperCase(parte.charAt(0)));
        }
        System.out.println("Iniciais: " + iniciais.toString());

    }
}
