package Giris;

import java.util.Scanner;

/**
 * @author aykutmurkit on 25.02.2022 - 22:34
 */

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;

        System.out.println("kullanıcı adinizi giriniz...");
        userName = input.nextLine();
        System.out.println("Parolanızı giriniz...");
        password = input.nextLine();

        if(userName.equals("aykutmurkit") && password.equals("1995"))
            System.out.println("giriş başarılı");
        else
            System.out.println("giriş başarısız");

    }
}
