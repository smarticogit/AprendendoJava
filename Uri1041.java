import java.util.Scanner;

public  class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double x, y;

        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if (x<0 && y<0 ){
            System.out.printf("Q3\n");
        } else if (x < 0 && y > 0){
            System.out.printf("Q2\n");
        } else if (x > 0 && y < 0){
            System.out.printf("Q4\n");
        } else if (x > 0 && y > 0){
            System.out.printf("Q1\n");
        } else if (y == 0 && x != 0){
            System.out.printf("Eixo X\n");
        } else if (x == 0 && y != 0){
            System.out.printf("Eixo Y\n");
        } else {
            System.out.printf("Origem\n");
        }

        teclado.close();
    }
}