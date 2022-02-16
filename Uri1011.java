import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//(4) * pi * R3 / 3
		
		double pi = 3.14159;
		int entrada = teclado.nextInt();
		
		double res = (Math.pow(entrada, 3)) * pi;
		res = (res * 4 ) /3;
		
		System.out.printf("VOLUME = %.3f\n", res);
		teclado.close();
	}
}
