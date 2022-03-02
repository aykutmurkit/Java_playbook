package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 2.03.2022 - 06:43
 */

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = scanner.nextInt();
        int toplam = 0;


        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }

        }

        if (toplam == n) {
            System.out.println(n + " bir mükemmel sayidir.");
        } else {
            System.out.println(n + " bir mükemmel sayi değildir");
        }


    }
}
