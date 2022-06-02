package examples;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Dairenin Yaricapini (r) Giriniz: ");
        double r = kb.nextDouble();

        System.out.print("Dairen Diliminin Acisini (a) Giriniz: ");
        double a = kb.nextDouble();

        double pi = 3.14;

        double alan = (pi * r * r * a) / 360;

        System.out.printf("Dairenin Alani : %f.2%n", alan);
    }
}
