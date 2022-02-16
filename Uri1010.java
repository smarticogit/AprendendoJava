import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        double valor1, valor2, total;

        cod1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        valor1 = teclado.nextDouble();
        cod2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valor2 = teclado.nextDouble();

        total = (qtd1 * valor1) + (qtd2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}