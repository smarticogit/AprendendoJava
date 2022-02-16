import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, resultado;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        // processamento
        resultado = (a * b - c * d);

        // saída 
        System.out.println("DIFERENCA = " + resultado);
        teclado.close();
   }
}