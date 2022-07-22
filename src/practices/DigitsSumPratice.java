package practices;

import java.util.Scanner;

public class DigitsSumPratice {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Basamaklarini toplamak istediginiz sayiyi giriniz: ");
        int val = Integer.parseInt(kb.nextLine());

        System.out.printf("%d' nin basamkari toplami = %d%n", val, digitsSum(val));
    }

    public static int digitsSum(int val)
    {
        int sum = 0;

        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }

        return Math.abs(sum);
    }
}
