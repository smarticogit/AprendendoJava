import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        //entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        // processamento
        triangulo = (a * c)/2; //dividir por 2 (base x altura)
        circulo =  (3.14159 * Math.pow(c, 2)); // Pi x raio2
        trapezio =  ((a + b) * c)/2; // somar as bases * altura e / 2
        quadrado = (b * b);  // lado ao quadrado
        retangulo =  (a * b);  // lado x altura

        // saida
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        teclado.close();
    }
}