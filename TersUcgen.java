package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 2.03.2022 - 06:51
 */

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen üçgenin boyutunu giriniz: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) { // aşağıya iniyoruz.

            for (int j = 0; j <= i; j++) { //boşlukları ekliyoruz.
                System.out.print(" ");
            }
            for (int k = 2 * n - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
