package exercicio3;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        String texto = new String();

        System.out.println("Escreva uma frase:");
        texto = ler.nextLine();

        for(int i=0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if(c == ' '){
                cont++;
            }
        }
        System.out.println("A palavra tem "+texto.length()+" caracteres e "+ (cont+1) +" palavras");
    }
}
