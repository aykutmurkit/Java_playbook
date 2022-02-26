package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 27.02.2022 - 01:20
 */

public class TekSayiGirileneKadarTopla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0, toplam = 0;
        do {
            System.out.println("bir sayi giriniz?");
            n = input.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        } while (n % 2 == 0);
        System.out.println("TOPLAM:" + toplam);
    }
}
