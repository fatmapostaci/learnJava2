package dersler.gun7;

import java.util.Scanner;

public class T03_LeapYear {
    /* Task->
   girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz: ");
        int year = input.nextInt();

        if (year % 4 == 0){
            // 100 e bölünüyor mu?
            if (year % 100 == 0) {
                // 400 e bölünüyor mu?
                if (year % 400 == 0){
                    System.out.println("Girdiğiniz değer artık yıldır");
                } else {
                    System.out.println(" Girdiğiniz değer artık yıl değil");
                }
            } else {
                System.out.println("Girdiğiniz değer artık yıldır");
            }

        } else {
            // leap year değil
            System.out.println(" Girdiğiniz değer artık yıl değil");
        }
 }
}
