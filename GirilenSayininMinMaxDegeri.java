package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 2.03.2022 - 06:21
 */

public class GirilenSayininMinMaxDegeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz? ");
        int n = scanner.nextInt();
        int min = 0;
        int max = 0;


        for (int i = 1; i <= n; i++) {

            System.out.print(i + ". sayiyi giriniz: ");
            int number = scanner.nextInt();


            if (i == 1) {
                min = number;
                max = number;
            } else {
                if (max < number) {
                    max = number;
                }
                if (min > number) {
                    min = number;
                }
            }


        }
        System.out.println("Girdiğiniz max değer: " + max);
        System.out.println("Girdiğiniz min değer: " + min);


    }
}
