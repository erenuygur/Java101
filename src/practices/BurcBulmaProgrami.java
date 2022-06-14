package practices;

import java.util.Scanner;

public class BurcBulmaProgrami {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");
        int month = kb.nextInt();

        System.out.print("Dogdugunuz gün: ");
        int day = kb.nextInt();

        if (month == 1 && day >= 1 && day <= 31) {
            if (day <= 21)
                System.out.println("Oglak Burcu");
            else
                System.out.println("Kova Burcu");
        }
        else if (month == 2 && day >= 1 && day <= 29) {
            if (day <= 19)
                System.out.println("Kova Burcu");
            else
                System.out.println("Balik Burcu");
        }
        else if (month == 3 && day >= 1 && day <= 31) {
            if (day <= 20)
                System.out.println("Balik Burcu");
            else
                System.out.println("Koc Burcu");
        }
        else if (month == 4 && day >= 1 && day <= 30) {
            if (day <= 20)
                System.out.println("Koc Burcu");
            else
                System.out.println("Boga Burcu");
        }
        else if (month == 5 && day >= 1 && day <= 31) {
            if (day <= 21)
                System.out.println("Boga Burcu");
            else
                System.out.println("Ikizler Burcu");
        }
        else if (month == 6 && day >= 1 && day <= 30) {
            if (day <= 22)
                System.out.println("Ikizler Burcu");
            else
                System.out.println("Yengec Burcu");
        }
        else if (month == 7 && day >= 1 && day <= 31) {
            if (day <= 22)
                System.out.println("Yengec Burcu");
            else
                System.out.println("Aslan Burcu");
        }
        else if (month == 8 && day >= 1 && day <= 31) {
            if (day <= 22)
                System.out.println("Aslan Burcu");
            else
                System.out.println("Basak Burcu");
        }
        else if (month == 9 && day >= 1 && day <= 30) {
            if (day <= 22)
                System.out.println("Basak Burcu");
            else
                System.out.println("Terazi Burcu");
        }
        else if (month == 10 && day >= 1 && day <= 31) {
            if (day <= 22)
                System.out.println("Terazi Burcu");
            else
                System.out.println("Akrep Burcu");
        }
        else if (month == 11 && day >= 1 && day <= 30) {
            if (day <= 21)
                System.out.println("Akrep Burcu");
            else
                System.out.println("Yay Burcu");
        }
        else if (month == 12 && day >= 1 && day <= 31) {
            if (day <= 21)
                System.out.println("Yay Burcu");
            else
                System.out.println("Oglak Burcu");
        }
    }
}
