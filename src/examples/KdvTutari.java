package examples;

import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args)
    {
       Scanner kb = new Scanner(System.in);

       double kdvOran = 1.18, tutar, kdvliTutar;

       System.out.print("Ucret tutarini giriniz :");
       tutar = kb.nextDouble();

       kdvliTutar = tutar * kdvOran;

       System.out.printf("KDV'li tutar : %.2f%n", kdvliTutar);
    }
}
