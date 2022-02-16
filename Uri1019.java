import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int s, m, h, n;

        n = teclado.nextInt();

        h = n / 3600;
        m = (n / 60) % 60;
        s = n % 60;

        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}