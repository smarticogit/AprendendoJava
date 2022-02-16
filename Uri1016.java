import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int km = teclado.nextInt();
		
		km = km * 2;
		
		System.out.println(km+" minutos");
		
		teclado.close();
	}

}
