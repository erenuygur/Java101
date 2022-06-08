package practices;

import java.util.Scanner;

public class SayilarArasiKarsilastirma {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz");
        int a = kb.nextInt();

        System.out.print("Ikinci sayiyi giriniz");
        int b = kb.nextInt();

        System.out.print("Ucuncu sayiyi giriniz");
        int c = kb.nextInt();

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - (max + min);

        if (min < mid)
            System.out.printf("%d < %d ", a, b);
        else
            System.out.printf("%d = %d ", a, b);

        if (mid < max)
            System.out.printf("< %d%n ", max);
        else
            System.out.printf("= %d%n ", max);

    }
}


