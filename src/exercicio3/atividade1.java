package exercicio3;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String texto = new String();
        int cont = 0;
        int cont2 = 0;

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

        if(texto.toLowerCase().startsWith("uni")){
            System.out.println("A palavra comeca com 'UNI'");
        }else{
            System.out.println("Nao inicia com 'UNI'");
        }
        if(texto.toLowerCase().endsWith("rio")){
            System.out.println("A palavra termina com 'RIO'");
        }else{
            System.out.println("Nao termina com 'RIO'");
        }
        for(int j=0; j<texto.length(); j++){
            if(Character.isDigit(texto.charAt(j))){
                cont2++;
            }
        }
        System.out.println("A string tem "+cont2+" digitos");

        StringBuilder textoInv = new StringBuilder();
        for(int k=texto.length()-1; k>=0; k--){
            textoInv.append(texto.charAt(k));
        }

        if(texto.equals(textoInv.toString())){
            System.out.println("Eh um palindromo");
        }else{
            System.out.println("Nao eh um palindromo");
        }


    }
}
