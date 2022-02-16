import java.util.Scanner;

public class Uri1015 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1, p2, res;
		
		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		res = Math.sqrt(p1 + p2);
		
		System.out.printf("%.4f\n", res);
		
		teclado.close();
	}
}
