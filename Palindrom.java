package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 2.03.2022 - 02:50
 */


public class Palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();


        String sonuc = isPalindrom(sayi) ? "evet" : "hayır";
        System.out.println(sonuc);
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10; //son sayıyı bulma
            reverseNumber = reverseNumber * 10 + lastNumber;
            temp /= 10; // sayiyi bir basamak küçültme
        }


        if (number == reverseNumber)
            return true;
        else
            return false;
    }
}
