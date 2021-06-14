package exercicio3;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String texto = new String();
        int cont = 0;

        System.out.println("Digite uma palavra");
        texto = ler.next();

        System.out.println("A palavra tem "+ texto.length() +" caracteres");
        System.out.println("A palavra em maiusculo: "+texto.toUpperCase());

        for(int i=0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                cont++;
            }
        }
        System.out.println("A palavra tem "+cont+" vogais.");

    }
}
