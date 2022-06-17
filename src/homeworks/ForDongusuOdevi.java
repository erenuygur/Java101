package homeworks;

import java.util.Scanner;

public class ForDongusuOrnegi {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int n = kb.nextInt();

        int count = 0;
        double sum = 0;

        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                ++count;
            }
        }
        double result = sum / count;
        System.out.println(result);
    }
}
