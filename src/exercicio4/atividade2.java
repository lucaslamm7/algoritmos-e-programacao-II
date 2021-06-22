package exercicio4;

public class atividade2 {
    public static void main(String[] args) {
        String txt = "Socorram-me, subi no ônibus em Marrocos", txtTemp[];;

        txtTemp = txt.split(" ");

        StringBuilder txtInv = new StringBuilder();

        txtInv.append(txtTemp[5]+" ").append(txtTemp[4]+" ").append(txtTemp[3]+" ").append(txtTemp[2]+" ").append(txtTemp[0]+" ");

        System.out.println(txtInv.toString());
    }
}
