import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num1, cont;
        double num2, soma, res;

        cont = 0;
        soma = 0;

        for (num1 = 0 ; num1 < 6 ; num1++) {
            num2 = teclado.nextDouble();
            if (num2 > 0){
            cont++;
            soma += num2;
            }
        }
        res = soma/cont;
        System.out.println("%d valores positivos", cont);
        System.out.printf("%.1f\n", res);
    }
}