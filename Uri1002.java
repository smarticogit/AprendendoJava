import java.util.Scanner;

public class Uri1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double raio, n, area;
                
        n = 3.14159;
        raio = teclado.nextDouble();
        
        area = n * (Math.pow(raio, 2));
        
        System.out.printf("A=%.4f\n", area);
        teclado.close();
    }
}