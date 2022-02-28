package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 28.02.2022 - 06:28
 */

public class harmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double total = 0;

        for (double i = 1.0; i <= n; i++) {

            total += 1 / i;

        }
        System.out.println(total);
    }
}
