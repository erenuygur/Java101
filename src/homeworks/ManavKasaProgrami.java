package homeworks;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);

      double elma, armut, domates, patlican, muz, total;

      System.out.print("Elma (kg):");
      elma = kb.nextDouble();

      System.out.print("Armut (kg):");
      armut = kb.nextDouble();

      System.out.print("Domates (kg):");
      domates = kb.nextDouble();

      System.out.print("Patlican (kg):");
      patlican = kb.nextDouble();

      System.out.print("Muz (kg):");
      muz = kb.nextDouble();

      total = (elma * 3.67) + (armut * 2.14) + (domates * 1.11) + (patlican * 5) + (muz * 0.95);

      System.out.print("Odeyeceginiz Toplam Tutar :" + total);
    }
}
