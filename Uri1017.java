import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double tempo, velocidade, litros;

        tempo = teclado.nextDouble();
        velocidade = teclado.nextDouble();

        litros = tempo * velocidade;
        litros = litros / 12;

        System.out.printf("%.3f\n", litros);

    }
}