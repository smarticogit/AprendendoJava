import java.util.Scanner;

public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salario, vendas, resultado;

        // entrada
        nome = teclado.next();
        salario = teclado.nextDouble();
        vendas = teclado.nextDouble();

        // processamento
        resultado = (vendas * 0.15);
        resultado = salario + resultado;

        // saída
        System.out.printf("TOTAL = R$ %.2f\n", resultado);
        teclado.close();
    }
}