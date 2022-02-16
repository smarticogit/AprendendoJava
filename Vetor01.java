import java.util.Scanner;

public class Vetor01{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        String vetor[];
        
        vetor = new String[10];
        
        System.out.println("Digite 10 strings diferentes");
        for (int i = 0 ; i < vetor.length ; i++) {
        	vetor[i] = teclado.nextLine();
        }
        
        System.out.println("-----------------------------");
        for (int i = 0 ; i < vetor.length ; i++) {
        	System.out.println("Vetor["+i+"] = "+vetor[i]);
        }
        
        
        
        
//        vetor[0] = teclado.nextLine();
//        vetor[1] = teclado.nextLine();
//        vetor[2] = teclado.nextLine();
//        vetor[3] = teclado.nextLine();
//        vetor[4] = teclado.nextLine();
//        vetor[5] = teclado.nextLine();
//        vetor[6] = teclado.nextLine();
//        vetor[7] = teclado.nextLine();
//        vetor[8] = teclado.nextLine();
//        vetor[9] = teclado.nextLine();
        
        teclado.close();
    }
}