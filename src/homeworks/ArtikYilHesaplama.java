package homeworks;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        int yil = kb.nextInt();

        if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0)
            System.out.println(yil + " Bir artik yildir !");
        else
            System.out.println(yil + " Bir artik yil degildir !");
    }
}
