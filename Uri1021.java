import java.util.Scanner;

public class Uri1021{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valor;
        int cem, cinquenta, vinte, dez, cinco, dois, um, mCinquenta, mVinteCinco, mDez, mCinco, mUm, resto;

        valor= teclado.nextDouble();

        resto = (int) (valor * 100);
        cem = resto / 10000;
        resto = resto % 10000;
        cinquenta = resto / 5000;
        resto = resto % 5000;
        vinte = resto / 2000;
        resto = resto % 2000;
        dez = resto / 1000;
        resto = resto % 1000;
        cinco = resto / 500;
        resto = resto % 500;
        dois = resto / 200;
        resto = resto % 200;
        um = resto / 100;
        resto = resto % 100;
        mCinquenta =  resto / 50;
        resto = resto % 50;
        mVinteCinco =  resto / 25;
        resto = resto % 25;
        mDez =  resto / 10;
        resto = resto % 10;
        mCinco =  resto / 5;
        mUm =  resto % 5;

        System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\n", cem, cinquenta, vinte, dez, cinco, dois);
        System.out.printf("MOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n", um, mCinquenta, mVinteCinco, mDez, mCinco, mUm);
        teclado.close();   
    }
}
