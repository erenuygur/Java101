package practices;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz :");
        String username = kb.nextLine();

        System.out.print("Sifrenizi giriniz :");
        String pass = kb.nextLine();

        if (username.equals("patika") && pass.equals("1234"))
            System.out.println("Basariyla giris yaptiniz");
        else {
            System.out.println("Girdiginiz sifre hatali");

            System.out.print("1-Sifremi sifirlamak istiyorum\n2-Islem yapmadan devam etmek istiyorum ");
            int select = Integer.parseInt(kb.nextLine());

            if (select == 1) {
                System.out.print("Yeni sifrenizi giriniz :");
                String newPass = kb.nextLine();

                if (newPass.equals("1234"))
                    System.out.println("Ayni sifreyi girdiniz. Lutfen tekrar deneyin");
                else
                    System.out.println("Yeni sifreniz basarilya olusturuldu");
            }
        }
    }
}
