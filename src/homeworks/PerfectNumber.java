package homeworks;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int val = Integer.parseInt(kb.nextLine());

        int sum = 0;

        for (int i = 1; i <= val / 2; ++i) {
            if (val % i == 0)
                sum += i;
        }

        System.out.println(sum == val ? "Mukemmel sayidir" : "Mukemmel sayi degildir");
    }
}
