package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 26.02.2022 - 04:32
 */

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mesafe, yas;
        double perKm = 0.10;
        double yasIndirimOrani = 0.0, yolculukTipiIndirimOrani = 0.0, tutar, normalTutar;
        int yolculukTipi;

        System.out.println("Mesafeyi km türünden giriniz:");
        mesafe = input.nextInt();

        System.out.println("Yaşınızı giriniz:");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini seçiniz: (1 --> tek yön , 2 --> çift yön)");
        yolculukTipi = input.nextInt();

        if (mesafe > 1) {
            if (yas > 1 && yas <= 120) {
                if (yolculukTipi == 1 || yolculukTipi == 2) {
                    if (yas < 12) {
                        yasIndirimOrani = 0.50;
                    } else if (yas >= 12 && yas <= 24) {
                        yasIndirimOrani = 0.10;
                    } else if (yas > 65) {
                        yasIndirimOrani = 0.30;
                    } else {
                        yasIndirimOrani = 1;
                    }

                    if (yolculukTipi == 1) {
                        yolculukTipiIndirimOrani = 1;
                    } else {
                        yolculukTipiIndirimOrani = 0.20;
                    }
                } else
                    System.out.println("hatalı gidiş dönüş girişi");
            } else
                System.out.println("hatalı yaş");

        } else
            System.out.println("mesafe hatası");


        normalTutar = mesafe * perKm;
        double yasIndirimi = normalTutar * yasIndirimOrani;
        double indirimliTutar = normalTutar - yasIndirimi;
        double gidisDonusBiletIndirimi = indirimliTutar * yolculukTipiIndirimOrani;
        double toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi) * 2;

        System.out.println("NORMAL TUTAR:"+normalTutar);
        System.out.println("YAS İNDİRİMİ"+yasIndirimi);
        System.out.println("İNDİRİMLİ TUTAR"+indirimliTutar);
        System.out.println("GİDİŞ DÖNÜŞ BİLET İNDİRİMİ"+gidisDonusBiletIndirimi+"\n");
        System.out.println("TOPLAM TUTAR" + toplamTutar);


    }
}
