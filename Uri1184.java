import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double matriz[][] = new double[12][12];
		double res=0;
//		char op;
		String op;
		int cont=0;
		
		// entrada
//		op = teclado.nextLine().charAt(0);
		op = teclado.nextLine();
		for (int l=0; l<12; l++) {
			for (int c=0;c<12;c++) {
				matriz[l][c] = teclado.nextDouble();
			}
		}
		
		// processamento
		for (int l=1; l < 12; l++) {
			for (int c = 0; c < l; c++) {
				res = res + matriz[l][c];
				cont++;
			}
		}
		
		if (op.equals("S")) {
			System.out.printf("%.1f\n", res);
		}
		else {
			System.out.printf("%.1f\n", res/cont);
		}
		teclado.close();
	}

}
