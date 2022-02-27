package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 27.02.2022 - 02:07
 * it doen not work
 */

public class kombinasyon {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int kombinasyon, nFaktoriyel = 1, rFaktoriyel = 1, nEksiRfaktoriyel = 1;


        if ((n > 0 && r > 0) && n > r) {

            for (int i = 1; i <= n; i++) {
                nFaktoriyel = nFaktoriyel * i;
            }
            System.out.println("n faktöriyel " + nFaktoriyel);

            for (int i = 1; i <= r; i++) {
                rFaktoriyel = rFaktoriyel * i;
            }
            System.out.println("r faktöriyel " + rFaktoriyel);

            int nEksiR = n - r;
            for (int i = 1; i <= nEksiR; i++) {
                nEksiRfaktoriyel = nEksiRfaktoriyel * i;
            }
            System.out.println("n-r faktöriyel " + nEksiRfaktoriyel);

            kombinasyon = nFaktoriyel / (rFaktoriyel * nEksiRfaktoriyel);
            System.out.println("kombinasyon " + kombinasyon);


        } else
            System.out.println("n r den büyük olmalı ve sıfır olmamalı");
    }
}