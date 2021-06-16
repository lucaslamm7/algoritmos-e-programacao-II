package exercicio3;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        String texto = new String();

        System.out.println("Escreva uma frase:");
        texto = ler.nextLine();

        texto = texto.replaceAll("\s+"," ");
        System.out.println(texto);
    }
}
