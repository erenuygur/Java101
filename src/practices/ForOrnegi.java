package practices;

import java.util.Scanner;

public class ForOrnegi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int sum = 0;7

        for (;;) {
            System.out.print("Bir sayi giriniz: ");
            int n = kb.nextInt();

            if (n % 2 != 0)
                break;

            if (n % 4 == 0)
                sum += n;
        }
        System.out.printf("%d%n", sum);
    }
}
