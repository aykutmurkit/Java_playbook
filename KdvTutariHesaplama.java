package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 24.02.2022 - 03:01
 */

public class KdvTutariHesaplama {

    public static void main(String[] args) {

        double tutar, kdvOrani = 0.18,kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen tutarı giriniz? (ogr: 2.0)");
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = kdvTutari + tutar;

        System.out.println("Tutar: "+tutar);
        System.out.println("KDV tutarı: "+kdvTutari);
        System.out.println("KDV'li tutar: "+kdvliTutar);

    }
}
