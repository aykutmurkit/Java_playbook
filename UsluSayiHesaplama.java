package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 27.02.2022 - 03:51
 */

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int taban, us;

        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz:");
        taban = input.nextInt();
        System.out.println("üssünü giriniz:");
        us = input.nextInt();

        int total = 1;

        for (int i = 1; i <= us; i++) {
            total *= taban;
        }
        System.out.println("sonuc: " + total);

    }
}
