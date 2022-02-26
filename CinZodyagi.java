package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 26.02.2022 - 17:12
 */

public class CinZodyagi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String zodyak = "";
        int dogumTarihi;


        System.out.println("Doğum tarihinizi giriniz:");
        dogumTarihi = input.nextInt();

        int kalan = dogumTarihi % 12;

        if (kalan == 0) {
            zodyak = "Maymun";
        } else if (kalan == 1) {
            zodyak = "Horoz";
        } else if (kalan == 2) {
            zodyak = "Köpek";
        } else if (kalan == 3) {
            zodyak = "Domuz";
        } else if (kalan == 4) {
            zodyak = "Fare";
        } else if (kalan == 5) {
            zodyak = "Öküz";
        } else if (kalan == 6) {
            zodyak = "Kaplan";
        } else if (kalan == 7) {
            zodyak = "Tavşan";
        } else if (kalan == 8) {
            zodyak = "Ejderha";
        } else if (kalan == 9) {
            zodyak = "Yılan";
        } else if (kalan == 10) {
            zodyak = "At";
        } else {
            zodyak = "Koyun";
        }


        System.out.println("ÇİN ZODYAĞI BURCUNUZ :"+zodyak);
    }
}
