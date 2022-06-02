package homeworks;

import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args)
    {
     Scanner kb = new Scanner(System.in);

     double boy, kilo, index;

     System.out.print("Boyunuzu Giriniz (m) :");
     boy = kb.nextDouble();

     System.out.print("Kilonuzu Giriniz (kg) :");
     kilo = kb.nextDouble();

     index = kilo / (boy * boy);

     System.out.printf("Vucut Kitle Endexiniz : %f%n", index);
    }
}
