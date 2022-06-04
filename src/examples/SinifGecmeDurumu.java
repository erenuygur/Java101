package examples;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik, ort;
        double total = 0;

        System.out.print("Matematik Notunuz : ");
        mat = kb.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = kb.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = kb.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = kb.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = kb.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = kb.nextInt();


       if (0 <= mat && mat <= 100)
           total += mat;

       if (0 <= fizik && fizik <= 100)
           total += fizik;

       if (0 <= kimya && kimya <= 100)
           total += kimya;

       if (0 <= turkce && turkce <= 100)
           total += turkce;

       if (0 <= tarih && tarih <= 100)
            total += tarih;

       if (0 <= muzik && muzik <= 100)
            total += muzik;

       double result = total / 6;

        System.out.println("" + (result >= 55 ? "Sinifi Gectiniz": "Sinifta Kaldiniz"));
    }
}
