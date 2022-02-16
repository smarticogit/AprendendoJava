import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = 0;

        if (b > a){
            c = b - a;
        } else if (a > b)
            c= (b + 12) - (a - 12);
        if (a == b){
            c = 24;
        }

        System.out.println("O JOGO DUROU "+c+" HORA(S)");

        teclado.close();
    }
}