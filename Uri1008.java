import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int id, horasTrabalhadas;
        double valorHoras, salario;

        // entrada
        id = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHoras = teclado.nextDouble();

        // processamento
        salario = (valorHoras * horasTrabalhadas);

        // saída
        System.out.printf("NUMBER = %d\n", id);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        teclado.close();
    }
}