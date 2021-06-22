package exercicio4;

public class atividade3 {
    public static void main(String[] args) {
        StringBuilder Ptxt = new StringBuilder();

        Ptxt.append("pA pppapppa pdpo pPpapppa");

        for(int i=0; i<Ptxt.length(); i++){
            if(Ptxt.charAt(i) == 'p'){
                Ptxt.delete(i, i+1);
            }
        }

        System.out.println(Ptxt);
    }
}
