package homeworks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());

        fibonacci(n);
    }

    public static void fibonacci(int n)
    {
        int a = 0, b = 1, sum = 0;

        for (int i = 0; i < n; ++i) {
            sum = a + b;

            System.out.printf("%d + %d = %d%n", a, b, sum);

            a = b;
            b = sum;

        }
    }
}
