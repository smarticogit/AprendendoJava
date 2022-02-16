import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int cod, qtd;
        float valor = 0.0f;
        
        cod = teclado.nextInt();
        qtd = teclado.nextInt();
        
        switch(cod) {
        case 1:
        	valor = qtd * 4.0f;
        	break;
        case 2:
        	valor = qtd * 4.50f;
        	break;
        case 3:
        	valor = qtd * 5.0f;
        	break;
        case 4:
        	valor = qtd * 2.0f;
        	break;
        case 5:
        	valor = qtd * 1.50f;
        	break;
        }
        
        System.out.printf("Total: R$ %.2f\n", valor);

        teclado.close();
    }
}