package Giris;


/**
 * @author aykutmurkit on 1.03.2022 - 21:02
 */

public class BirYuzArasiAsalSayilar {
    public static void main(String[] args) {
        int sayi = 2;


        for (int k = 0; k < 99; k++) {
            int sayac = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }


    }
}
