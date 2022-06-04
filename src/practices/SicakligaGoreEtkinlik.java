package practices;

import java.util.Scanner;

public class SicakligaGoreEtkinlik {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Hava sicakligini giriniz : ");
        int sicaklik = kb.nextInt();

        String s = (sicaklik < 5 ? "Kayaga gidebilirsiniz": (sicaklik < 15 ? "Sinemaya gidebilirsiniz":(sicaklik < 25 ? "Piknige gidebilirsiniz": "Yuzmeye gidebilirsiniz")));

        System.out.println(s);
    }
}
