package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 24.02.2022 - 21:11
 */

public class Manav {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int kg;
    double  armut = 2.14,
            elma =3.67,
            domates = 1.11,
            muz = 0.95,
            patlican = 5.00;


    System.out.println("kaç tane armut almak istiyorsunuz?");
    kg = input.nextInt();
    armut = kg * armut;

    System.out.println("kaç tane elma almak istiyorsunuz?");
    kg = input.nextInt();
    elma = kg * elma;

    System.out.println("kaç tane domates almak istiyorsunuz?");
    kg = input.nextInt();
    domates = kg * domates;

    System.out.println("kaç tane muz almak istiyorsunuz?");
    kg = input.nextInt();
    muz = kg * muz;

    System.out.println("kaç tane patlican almak istiyorsunuz?");
    kg = input.nextInt();
    patlican = kg * patlican;

    double toplam = armut+elma+domates+muz+patlican;

    System.out.println("TOPLAM TUTAR: "+toplam);

  }
}
