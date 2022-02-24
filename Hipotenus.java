package Giris;

import java.util.*;



/**
 * @author aykutmurkit on 24.02.2022 - 03:25
 */

public class Hipotenus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b;
        double c;

        System.out.println("a kenarını giriniz...");
        a = input.nextInt();
        System.out.println("b kenarını giriniz...");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("hipotenüs: "+c);
    }
}
