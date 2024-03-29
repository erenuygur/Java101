package homeworks;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Hangi sayiya kadar olan asal sayilari gormek istiyorsunuz: ");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i <= n; ++i)
            if (isPrime(i))
                System.out.printf("%d ", i);
    }

    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (int i = 11; i * i < val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}
