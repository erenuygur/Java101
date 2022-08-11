package practices;

public class PalindromNumber {
    public static void main(String[] args)
    {
        for (int i = 1; i < 1000; ++i)
            if (isPalindrom(i))
                System.out.println(i);
    }

    public static boolean isPalindrom(int number)
    {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
}
