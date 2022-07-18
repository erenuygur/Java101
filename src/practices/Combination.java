package practices;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("n : ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.print("r: ");
        int r = Integer.parseInt(kb.nextLine());

        int result = combination(n, r);
        System.out.println(result);

    }

    public static int combination(int n, int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int factorial(int val)
    {
        for (int i = val - 1; 0 < i; --i)
            val *= i;

        return val;
    }
}
