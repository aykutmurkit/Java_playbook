package Giris;

/**
 * @author aykutmurkit on 27.02.2022 - 01:50
 */

public class DortVeBesinKuvvetleriniBulanProgram {
    public static void main(String[] args) {


        int n = 6000000;

        // ve dendiği için 4*5 yapıyorum ortak kat alıp

        for(int i = 1;i<n;i*=20){
            System.out.println(i);
        }
    }

}
