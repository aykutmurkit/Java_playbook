package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 24.02.2022 - 02:41
 */

public class NotHesaplamaYeni {
  public static void main(String[] args) {
    int matematik, fizik, kimya, biyoloji, edebiyat, ingilizce, almanca;

    Scanner input = new Scanner(System.in);

    System.out.println("Lütfen matematik notunuzu giriniz: ");
    matematik = input.nextInt();
    System.out.println("Lütfen fizik notunuzu giriniz: ");
    fizik = input.nextInt();
    System.out.println("Lütfen kimya notunuzu giriniz: ");
    kimya = input.nextInt();
    System.out.println("Lütfen biyoloji notunuzu giriniz: ");
    biyoloji = input.nextInt();
    System.out.println("Lütfen edebiyat notunuzu giriniz: ");
    edebiyat = input.nextInt();
    System.out.println("Lütfen ingilizce notunuzu giriniz: ");
    ingilizce = input.nextInt();
    System.out.println("Lütfen almanca notunuzu giriniz: ");
    almanca = input.nextInt();

    double result = matematik + fizik + kimya + biyoloji + edebiyat + ingilizce + almanca ;

    result /= 7;

    System.out.println("ortalamanız "+ result);

    boolean kosul = result >= 60 ? true : false;

    System.out.println("geçiş durumu " + kosul);



  }
}
