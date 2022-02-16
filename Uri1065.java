import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, num, res;

        res = 0;
        for (num = 0; num < 5 ; num++) {
            valor = teclado.nextInt();
            if(valor%2 == 0) {
               res++; 
            }
        }
        System.out.println(res+" valores pares");
    }
}