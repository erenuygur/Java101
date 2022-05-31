package examples;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik, ort;

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

        ort = mat + fizik + kimya + turkce + tarih + muzik;
        double result = ort / 6;

        System.out.println("" + (result > 60 ? "Sinifi Gectiniz": "Sinifta Kaldiniz"));
    }
}
