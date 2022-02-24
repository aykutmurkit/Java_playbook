package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 24.02.2022 - 19:04
 */

public class VucutKitleIndex {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int kg;
    double index,m;

    System.out.println("Bu program vücut kitle indexi buluyor: ");
    System.out.println("kilonuzu giriniz:...");
    kg = input.nextInt();
    System.out.println("boyunuzu giriniz:...");
    m = input.nextDouble();

    System.out.println(kg);
    System.out.println(m);

    index = kg/(m*m);

    System.out.println(index);

  }
}
