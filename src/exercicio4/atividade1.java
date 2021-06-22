package exercicio4;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String txt = "Socorram-me, subi no ônibus em Marrocos", txtInv[];

        txtInv = txt.split(" ");

        System.out.println(txtInv[5]+" "+txtInv[4]+" "+txtInv[3]+" "+txtInv[2]+" "+txtInv[1]+" "+txtInv[0]);
    }
}
