package codeChallenge.ALLSUBJECTS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        //Görev 1: Mevcut tarihi ve saati ekrana yazdıran bir program yazın.
        LocalDate mevcutTarih = LocalDate.now();
        LocalTime mevcutSaat = LocalTime.now();
        System.out.println("SAAT " + mevcutSaat.toString() + " TARİH " + mevcutTarih.toString());

        //
        //Görev 2: Kullanıcıdan bir tarih girişi alarak, o tarihin haftanın hangi gününe denk geldiğini bulan bir program yazın.
        System.out.println("Kullanıcıdan bir tarih girişi al");
        String tarihStr = (new Scanner(System.in)).nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateTarihStr = null;
        try {
            localDateTarihStr = LocalDate.parse(tarihStr,format);
        } catch (Exception e) {
            System.out.println( "format kabul edilmedi. Doğru format  dd.MM.yyyy  olmalıdır");
        }
        finally {
            System.out.println("localDateTarihStr = " + localDateTarihStr);
        }
        //
        //Görev 3: İki tarih arasındaki gün farkını hesaplayan bir metod yazın.
        //
        //Görev 4: Belirli bir saati 2 saat ileri ve 30 dakika geri alan bir program yazın.
        //
        //Görev 5: Şu çıktıyı üretecek bir metod yazın:
        //
        //Bugün: 2024-08-30
        //Şu anki saat: 14:45
        //Bir hafta sonrası: 2024-09-06
        //

    }
}
