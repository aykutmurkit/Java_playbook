package Giris;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * @author aykutmurkit on 25.02.2022 - 22:53
 */

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dersSayisi = 0, toplamNot = 0;

        System.out.println("Matematik notlarınızı giriniz.");
        toplamNot += input.nextInt();
        dersSayisi++;
        System.out.println("Fizik notlarınızı giriniz.");
        toplamNot += input.nextInt();
        dersSayisi++;
        System.out.println("Türkçe notlarınızı giriniz.");
        toplamNot += input.nextInt();
        dersSayisi++;
        System.out.println("Kimya notlarınızı giriniz.");
        toplamNot += input.nextInt();
        dersSayisi++;
        System.out.println("Müzik notlarınızı giriniz.");
        toplamNot += input.nextInt();
        dersSayisi++;

        double ortalama = toplamNot / dersSayisi;

        System.out.println(dersSayisi);

        System.out.println(ortalama);

        String  sonuc = ( ortalama > 50 ) ? "geçti" : "Kaldı";

        System.out.println(sonuc);


    }
}
