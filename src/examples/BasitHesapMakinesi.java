package examples;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        double x, y;

        System.out.print("Ilk sayiyi giriniz :");
        x = kb.nextDouble();

        System.out.print("Ikinci sayiyi giriniz :");
        y = kb.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Hangi islemi yapmak istiyorsunuz :");
        int secim = kb.nextInt();

        switch (secim) {
        case 1:
            System.out.println("" + (x + y));
            break;
        case 2:
            System.out.println("" + (x - y));
            break;
        case 3:
            System.out.println("" + (x * y));
            break;
        case 4:
            System.out.println("" + (x / y));
            break;
        default:
            System.out.println("Gecersiz bir secim yaptiniz. Tekrar deneyin");
        }
    }
}
