package practices;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Ussu alinacak sayi: ");
            int a = Integer.parseInt(kb.nextLine());

            if (a == 0)
                break;

            System.out.print("Us alinacak sayi: ");
            int n = Integer.parseInt(kb.nextLine());

            System.out.println(findExponential(a, n));
        }
    }

    public static int findExponential(int a, int n)
    {
        return (int)Math.pow(a, n);
    }
}
