package homeworks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (isPrime(val))
            System.out.printf("%d asal bir sayidir", val);
        else
            System.out.printf("%d asal bir sayi degildir", val);

    }

    public static boolean isPrime(int val)
    {
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
