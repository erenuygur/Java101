package practices;

import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Seri icin bir n sayisi giriniz: ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.println(calculateHarmonicSeries(n));
    }

    public static double calculateHarmonicSeries(int n)
    {
        double sum = 1;

        for (int i = 2; i <= n; ++i)
            sum += (double)1 / i;

        return sum;
    }
}
