package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 2.03.2022 - 07:02
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("fibonacci serisi kaç elemanlı olacak?: ");
        int n = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;


        // n1+n2 = n3

        if (n == 1) {
            System.out.print(n1 + " ");
        } else
            System.out.print(n1 + " " + n2);


        for (int i = 2; i <= n; ++i) {

            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }

    }
}
