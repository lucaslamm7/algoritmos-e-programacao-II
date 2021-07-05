package exercicio5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String txt;
        String regexcel = "/\\(\\d{2}\\)\\s9?\\d{4}-\\d{4}/";
        String regextel = "/\\(\\d{2}\\)\\s\\d{4}-\\d{4}/";
        //String regexcel = "/\\(\\d\\d\\)\\s\\d\\d\\d\\d\\d-\\d\\d\\d\\d";
        //String regextel = "/\\(\\d\\d\\)\\s\\d\\d\\d\\d-\\d\\d\\d\\d";
        System.out.println("Escreva um numero, se for valido, sera determinado se eh telefone fixo ou celular");
        txt = ler.nextLine();

        System.out.println(txt);

        Pattern pCel = Pattern.compile(regexcel, Pattern.CASE_INSENSITIVE);
        Matcher mCel = pCel.matcher(txt);

        Pattern pTel = Pattern.compile(regextel, Pattern.CASE_INSENSITIVE);
        Matcher mTel = pTel.matcher(txt);

        if(mCel.find()){
            System.out.println("Celular");
        }
        else if(mTel.find()){
            System.out.println("Telefone Fixo");
        }else{
            System.out.println("Numero Invalido");
        }

    }
}
