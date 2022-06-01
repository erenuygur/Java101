package examples;

import java.util.Scanner;

public class AreaCalculater {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int a, b, c, cevre;
        double alan;

        System.out.print("Ilk kosenin uzunlugunu giriniz");
        a = Integer.parseInt(kb.nextLine());

        System.out.print("Ikinci kosenin uzunlugunu giriniz");
        b = Integer.parseInt(kb.nextLine());

        System.out.print("Ucuncu kosenin uzunlugunu giriniz");
        c = Integer.parseInt(kb.nextLine());

        cevre = a + b + c;

        double u = cevre / 2;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.printf("Ucgenin Alani = %.2f%n", alan);
    }
}
