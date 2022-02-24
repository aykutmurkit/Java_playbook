package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 24.02.2022 - 18:33
 */

public class Taksimetre {
  public static void main(String[] args) {
    int km,startPrice = 10;
    double perKm = 2.20;

    Scanner input = new Scanner(System.in);

    System.out.println("Kaç km gideceksiniz...");
    km = input.nextInt();

    double toplamTutar = km * perKm;
    toplamTutar += startPrice;

    toplamTutar = toplamTutar < 20 ? 20 : toplamTutar;
    System.out.println("toplam tutar "+toplamTutar);

  }
}
