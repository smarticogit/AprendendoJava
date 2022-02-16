import java.util.Scanner;

public class Uri1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c, resultado;
        double r1, r2;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        
        resultado = Math.pow(b, 2)  - (4 * a * c);
        
        if (resultado < 0 || (2 * a) == 0) {
        	System.out.println("Impossivel calcular");
        }
        else {
        	r1 = (-b + Math.sqrt(resultado)) / (2 * a);
        	r2 = (-b - Math.sqrt(resultado)) / (2 * a);
        	
        	System.out.printf("R1 = %.5f\n", r1);
        	System.out.printf("R2 = %.5f\n", r2);
        }
        teclado.close();
    }
}