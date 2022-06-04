package practices;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        double tutar, km;

        System.out.print("Kac km yol yapildi");
        km = Double.parseDouble(kb.nextLine());

        tutar = 10 + km * 2.2;

        if (tutar < 20)
            System.out.println("Odenecek ucret = 20TL");
        else
            System.out.printf("Odenecek ucret = %.2f%n", tutar);
    }
}
