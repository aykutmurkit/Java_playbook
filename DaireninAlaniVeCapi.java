package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 24.02.2022 - 18:44
 */

public class DaireninAlaniVeCapi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double pi = 3.14, alan, chevre ;

        System.out.println("lütfen dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        chevre = 2 * pi * r;
        alan = 2 * pi * r;

        System.out.println("Dairenin çevresi: "+chevre);
        System.out.println("Dairenin alanı: "+alan);
    }
}
