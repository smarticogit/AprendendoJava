import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		int res = (a+b+Math.abs(a-b))/2;
		
		if (c > res) {
			res = c;
		}
	
		System.out.println(res+" eh o maior");
		
		teclado.close();
	}

}
