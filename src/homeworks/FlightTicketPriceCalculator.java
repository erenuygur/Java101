package homeworks;

import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args)
    {
       Scanner kb = new Scanner(System.in);

       System.out.print("Mesafeyi Giriniz (km): ");
       int yol = kb.nextInt();

       System.out.print("Yasinizi Giriniz: ");
       int yas = kb.nextInt();

       System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yon , 2 => Gidis Donus): ");
       int yolculukTipi = kb.nextInt();

       double tutar = yol * 0.10;

       if (yas <= 0 || yolculukTipi != 1 || yolculukTipi != 2 || yol <= 0) {
           System.out.println("Hatali veri girdiniz !");
           return;
       }

       if (yas < 12)
           tutar *= 0.5;
       if (yas >= 12 && yas <= 24)
           tutar *= 0.9;
       if (yas > 65)
           tutar *= 0.7;

       if (yolculukTipi == 2)
           tutar *= 1.6;

       System.out.println("Toplam Tutar " + tutar);

    }
}
