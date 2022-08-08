package homeworks;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = kb.nextInt();

        int max = 0, min = 0;

        for (int i = 1; i <= n; ++i) {
            System.out.println(i + ". Sayiyi giriniz: ");
            int number = kb.nextInt();

            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En buyuk sayi: " + min);
    }
}
