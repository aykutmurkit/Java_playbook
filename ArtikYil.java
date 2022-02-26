package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 26.02.2022 - 17:57
 */

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;
        yil = input.nextInt();


        if (yil % 4 == 0) {
            System.out.println("artik yil");
        } else if ((yil % 100 == 0) && (yil % 400 == 0)) {
            System.out.println("artık yıl");
        } else
            System.out.println("artık yıl değil");


    }
}
