import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int res[] = new int[6], ap1[] = new int[7], ap1cont=0, ap2[] = new int[7], ap2cont=0,  ap3[] = new int[7], ap3cont=0, ap4[] = new int[7], ap4cont=0, ap5[] = new int[7], ap5cont=0;

        System.out.println("Digite o resultado da loteria: \n");
        for(int i=0; i<6; i++){
            res[i] = ler.nextInt();
        }
        System.out.println("Digite seus numeros da loteria e por fim o numero do cartao: \n");
        for(int a=0; a<7; a++){
            ap1[a] = ler.nextInt();
        }

        System.out.println("Digite seus numeros da loteria e por fim o numero do cartao: \n");
        for(int b=0; b<7; b++){
            ap2[b] = ler.nextInt();
        }

        System.out.println("Digite seus numeros da loteria e por fim o numero do cartao: \n");
        for(int c=0; c<7; c++){
            ap3[c] = ler.nextInt();
        }

        System.out.println("Digite seus numeros da loteria e por fim o numero do cartao: \n");
        for(int d=0; d<7; d++){
            ap4[d] = ler.nextInt();
        }

        System.out.println("Digite seus numeros da loteria e por fim o numero do cartao: \n");
        for(int e=0; e<7; e++){
            ap5[e] = ler.nextInt();
        }

        for(int f=0; f<6; f++){
            for(int f1=0; f1<6; f1++){
                if(ap1[f1] == res[f]){
                    ap1cont++;
                }
            }
        }
        for(int g=0; g<6; g++){
            for(int g1=0; g1<6; g1++){
                if(ap2[g1] == res[g]){
                    ap2cont++;
                }
            }
        }
        for(int h=0; h<6; h++){
            for(int h1=0; h1<6; h1++){
                if(ap3[h] == res[h]){
                    ap3cont++;
                }
            }
        }
        for(int j=0; j<6; j++){
            for(int j1=0; j1<6; j1++){
                if(ap4[j] == res[j]){
                    ap4cont++;
                }
            }
        }
        for(int k=0; k<6; k++){
            for(int k1=0; k1<6; k1++){
                if(ap5[k] == res[k]){
                    ap5cont++;
                }
            }
        }

        if(ap1cont == 0 && ap2cont == 0 && ap3cont == 0 && ap4cont == 0 && ap5cont == 0){
            System.out.println("Nao houve ganhadores");
        }
        else if(ap1cont > ap2cont && ap1cont > ap3cont && ap1cont > ap4cont && ap1cont > ap5cont){
            System.out.println("O apostador com cartao numero "+ ap1[6] +"venceu com "+ ap1cont +" acertos");
        }
        else if(ap2cont > ap1cont && ap2cont > ap3cont && ap2cont > ap4cont && ap2cont > ap5cont){
            System.out.println("O apostador com cartao numero "+ ap2[6] +"venceu com "+ ap2cont +" acertos");
        }
        else if(ap3cont > ap1cont && ap3cont > ap2cont && ap3cont > ap4cont && ap3cont > ap5cont){
            System.out.println("O apostador com cartao numero "+ ap3[6] +"venceu com "+ ap3cont +" acertos");
        }
        else if(ap4cont > ap1cont && ap4cont > ap2cont && ap4cont > ap3cont && ap4cont > ap5cont){
            System.out.println("O apostador com cartao numero "+ ap4[6] +"venceu com "+ ap4cont +" acertos");
        }
        else if(ap5cont > ap1cont && ap5cont > ap2cont && ap5cont > ap3cont && ap5cont > ap4cont){
            System.out.println("O apostador com cartao numero "+ ap5[6] +"venceu com "+ ap5cont +" acertos");
        }else{
            System.out.println("Houve empate");
        }

    }
}
