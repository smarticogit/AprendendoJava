import java.util.Scanner;

public class Uri1174{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		double A[] = new double [100];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = teclado.nextDouble();
			
		}
		for(int i = 0; i < A. length; i++) {
			if (A[i] <= 10){
				System.out.println("A["+i+"] = "+A[i]);
			}
			
		teclado.close();
		}
	}
}
