package TemelKavramlarDegiskenler;

public class NotOrtalamasiHesaplayici {

    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        int mat = Integer.parseInt(kb.nextLine());

        System.out.print("Fizik notunuzu giriniz:");
        int fiz = Integer.parseInt(kb.nextLine());

        System.out.print("Kimya notunuzu giriniz:");
        int kim = Integer.parseInt(kb.nextLine());

        System.out.print("Biyoloji notunuzu giriniz:");
        int biyo = Integer.parseInt(kb.nextLine());

        System.out.print("Tarih notunuzu giriniz:");
        int tar = Integer.parseInt(kb.nextLine());

        System.out.print("Muzik notunuzu giriniz:");
        int muz = Integer.parseInt(kb.nextLine());

        double totNot = (mat + fiz + kim + biyo + tar + muz) / 6.0;

        System.out.println(totNot > 60 ? "Gecti": "Kaldi");

    }

}
