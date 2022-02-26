package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 26.02.2022 - 03:31
 */

public class BurcHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gun;
        String burc = "";
        String ay = "";


        System.out.println("Hangi ay doğdunuz?:");
        ay = input.nextLine();

        System.out.println("hangi gün doğdunuz?");
        gun = input.nextInt();

        if (ay.equals("ocak")) {
            if (gun >= 0 && gun <= 31) {
                if (gun <= 21) {
                    burc = "oğlak";
                } else
                    burc = "kova";
            }
        } else if (ay.equals("şubat")) {
            if (gun >= 0 && gun <= 28) {
                if (gun <= 19) {
                    burc = "kova";
                } else
                    burc = "balık";
            }
        } else if (ay.equals("mart")) {
            if (gun >= 0 && gun <= 31) {
                if (gun <= 20) {
                    burc = "balık";
                } else
                    burc = "koç";
            }
        } else if (ay.equals("nisan")) {
            if (gun >= 0 && gun <= 30) {
                if (gun <= 20) {
                    burc = "koç";
                } else
                    burc = "boğa";
            }
        } else if (ay.equals("mayıs")) {
            if (gun >= 0 && gun <= 31) {
                if (gun <= 21) {
                    burc = "boğa";
                } else
                    burc = "ikizler";
            }
        } else if (ay.equals("haziran")) {
            if (gun >= 0 && gun <= 30) {
                if (gun <= 22) {
                    burc = "ikizler";
                } else
                    burc = "yengeç";
            }
        } else if (ay.equals("temmuz")) {
            if (gun >= 0 && gun <= 31) {
                if (gun <= 22) {
                    burc = "yengeç";
                } else
                    burc = "aslan";
            }
        } else if (ay.equals("ağustos")) {
            if (gun >= 0 && gun <= 31) {
                if (gun <= 22) {
                    burc = "aslan";
                } else
                    burc = "başak";
            }
        } else if (ay.equals("eylül")) {
            if (gun >= 0 && gun <= 30) {
                if (gun <= 22) {
                    burc = "başak";
                } else
                    burc = "terazi";
            }
        } else if (ay.equals("ekim")) {
            if (gun >= 0 && gun <= 31) {
                if (gun <= 22) {
                    burc = "terazi";
                } else
                    burc = "akrep";
            }
        } else if (ay.equals("kasım")) {
            if (gun >= 0 && gun <= 30) {
                if (gun <= 21) {
                    burc = "akrep";
                } else
                    burc = "yay";
            }
        } else {
            if (gun >= 0 && gun <= 30) {
                if (gun <= 21) {
                    burc = "yay";
                } else
                    burc = "oğlak";
            }

        }
        System.out.println("burcunuz: "+burc);
    }
}
