package practices;

import java.util.Scanner;

public class FindPows {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Sinir degerini giriniz: ");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 1; i <=n; i *= 4)
            System.out.println(i);

        System.out.println("-----------------------------");

        for (int i = 1; i <=n; i *= 5)
            System.out.println(i);
    }
}
