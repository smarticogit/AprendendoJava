import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor,
            po = 0, 
            ne = 0, 
            pa = 0,
            im = 0;

        for (int num = 0; num < 5 ; num++) {
            valor = teclado.nextInt();
            if(valor % 2 == 0) {
                pa += 1;
            } else {
                im += 1;
            } 

            if(valor > 0) {
                po += 1;
            } else if (valor < 0) {
                ne += 1;
            }
        }
        System.out.println(pa+" valor(es) par(es)");
        System.out.println(im+" valor(es) impar(es)");
        System.out.println(po+" valor(es) positivo(s)");
        System.out.println(ne+" valor(es) negativo(s)");
    }
}