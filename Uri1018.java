import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;

        valor = teclado.nextInt();

        System.out.println(valor);

        System.out.printf("%d nota(s) de R$ 100,00\n", valor / 100);

        valor = valor % 100;

        System.out.printf("%d nota(s) de R$ 50,00\n", valor / 50);

        valor = valor % 50;

        System.out.printf("%d nota(s) de R$ 20,00\n", valor / 20);

        valor = valor % 20;

        System.out.printf("%d nota(s) de R$ 10,00\n", valor / 10);

        valor = valor % 10;

        System.out.printf("%d nota(s) de R$ 5,00\n", valor / 5);

        valor = valor % 5;

        System.out.printf("%d nota(s) de R$ 2,00\n", valor / 2);

        valor = valor % 2;

        System.out.printf("%d nota(s) de R$ 1,00\n", valor / 1);

        valor = valor % 1;
    }
}