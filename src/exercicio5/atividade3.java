package exercicio5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String txt;
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";

        System.out.println("Digite uma senha");
        txt = ler.nextLine();

        Pattern senha = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher msenha = senha.matcher(txt);

        if(msenha.find()){
            System.out.println("Senha forte");
        }else{
            System.out.println("Nao eh senha forte");
        }
    }
}
