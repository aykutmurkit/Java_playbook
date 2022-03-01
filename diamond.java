package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 28.02.2022 - 06:48
 */

public class diamond {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int number = klavye.nextInt();
        int i, j;


        for (i = 0; i <= number; i++) {
            for (j = 1; j <= number - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = number - 1; i >= 1; i--) {
            for (j = 1; j <= number - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }


    }
}
