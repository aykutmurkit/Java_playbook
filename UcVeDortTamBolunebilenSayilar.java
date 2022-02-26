package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 26.02.2022 - 19:33
 */

public class UcVeDortTamBolunebilenSayilar {
    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
            }
        }


    }
}
