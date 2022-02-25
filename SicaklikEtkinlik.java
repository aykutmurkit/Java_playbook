package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 26.02.2022 - 02:18
 */

public class SicaklikEtkinlik {
   public static void main(String[] args) {

    int heat;


    Scanner input = new Scanner(System.in);
    heat = input.nextInt();

    if(heat < 5){
      System.out.println("Kayak");
    }
    if(heat > 5 && heat < 15){
      System.out.println("Sinema");
    }
    if(heat > 15 && heat < 25){
      System.out.println("Piknik");
    }
    if(heat > 25){
      System.out.println("yüzme");
    }
   }
}
