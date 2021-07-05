package exercicio5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String txt;
        String regex = "(https|ftp|http)://www\\.[-A-Z0-9+&@#/%?=~_|.]*[-A-Z0-9+&@#/%=~_|](\\.com\\.br|\\.com)";

        System.out.println("Digite uma URL");
        txt=ler.nextLine();

        Pattern URL = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher mURL = URL.matcher(txt);

        if(mURL.find()){
            System.out.println("URL valida");
        }else{
            System.out.println("URL invalida");
        }


    }
}
