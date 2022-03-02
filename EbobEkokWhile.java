package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 2.03.2022 - 05:59
 */

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz...");
        int n1 = scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz...");
        int n2 = scanner.nextInt();

        System.out.println(n1 + " " + n2);


        // numaralari sıralıyoruz

        if (n2 > n1) {
            int temp = 0;
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n1 + " " + n2);

        int i = 1, ebob = 0;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        //ekok a bakacağız şimdi

        int k = 1, ekok = 0;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        ekok = ((n1 * n2) / ebob);

        System.out.println("ebob değeri : " + ebob);
        System.out.println("ekok değeri : " + ekok);

    }
}
