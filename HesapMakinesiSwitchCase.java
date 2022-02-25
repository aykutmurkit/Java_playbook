package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 25.02.2022 - 22:08
 */

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int s1, s2;

        System.out.println("Birinci sayiyi giriniz...");
        s1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz...");
        s2 = input.nextInt();

        System.out.println("""
                1.Toplama\s
                2.Çıkarma\s
                3.Çarpma\s
                4.Bölme""");


        int secim;
        secim = input.nextInt();


        switch (secim) {
            case 1:
                System.out.println(s1 + s2);
                break;
            case 2:
                System.out.println(s1 - s2);
            case 3:
                System.out.println(s1 * s2);
            case 4:
                if (s2 != 0)
                    System.out.println(s1 / s2);
                else
                    System.out.println("ikinci sayi sıfır olamaz");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
