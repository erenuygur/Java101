package practices;

import java.util.Scanner;

public class BasicATM {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int right = 3;
        int balance = 2000;

        FIRST_LOOP:
        for (;right > 0;) {
            System.out.print("Kullanıcı Adınız :");
            String userName = kb.nextLine();

            System.out.print("Parolanız : ");
            String password = kb.nextLine();

            if (userName.equals("eren") && password.equals("123")) {
                System.out.println("Basarili bir sekilde giris yaptiniz!");

                for (;;) {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    int select = Integer.parseInt(kb.nextLine());

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = Integer.parseInt(kb.nextLine());
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            price = Integer.parseInt(kb.nextLine());

                            if (price > balance)
                                System.out.println("Bakiye yetersiz.");
                            else
                                balance -= price;
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break FIRST_LOOP;
                    }
                }
            }
            else {
                --right;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
