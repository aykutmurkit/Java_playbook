package Giris;

/**
 * @author aykutmurkit on 27.02.2022 - 05:09
 */

public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        int number = 407;

        int total = 0;
        int basamakNumber = 0, tempNumber = number;
        int basamakValue;

        //BASAMAK SAYİSİNI BULMA

        while (tempNumber != 0) {

            tempNumber /= 10;
            basamakNumber++;
        }
        System.out.println("Basamak Sayisi " + basamakNumber);


        //BASAMAKLARI BULMA VE TOPLAMA

        tempNumber = number;

        while (tempNumber != 0) {
            basamakValue = tempNumber % 10;
            System.out.println(basamakValue);
            total += basamakValue;
            tempNumber /= 10;

        }
        System.out.println(total);
    }
}
