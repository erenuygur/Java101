package practices;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("n : ");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < 2 * n; ++i) {
            for (int k = 1; k <= n - i; ++k)
                System.out.print(" ");

            if (i <= n)
                for (int k = 0; k < 2 * i -1; ++k)
                    System.out.print("*");
            else {
                for (int k = 1; k <= i % n; ++k)
                    System.out.print(" ");

                for (int k = 0; k <= 2 * n - (i % n) * 2 - 1; ++k)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
