import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){

        // 1 coisa: declarar uma variavel do tipo scanner
        // 2 instanciar o componente teclado  apontando o dispositivo de entrada padrao
        Scanner teclado = new Scanner(System.in);
        
        int valorI;
        double valorD;

        System.out.println("Digite um valor inteiro");
        valorI = teclado.nextInt();
        System.out.println("Voce digitou o valor" + valorI);
        
        System.out.println("Agora digite um valor REAL!!!");
        valorD = teclado.nextDouble();

        teclado.close();

    }
}