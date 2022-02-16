import java.util.Scanner;

public  class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int x;
        double y, res;

        x = teclado.nextInt();
        y = teclado.nextDouble();

        res = x/y;

        System.out.printf("%.3f km/l\n", res);
    }
}