package dersler.gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mentoring {
    public static void main(String[] args) {
        /* Boş Bir ArrayList Oluşturup Eleman Eklemek (add() Metodu ile) */
// Soru 1 : ogrenciler adında bir ArrayList oluşturnuz.
// Ve bu listeye add() methodunu kullnarak 3 öğrenci ekleyiniz
// Listeyi yazdırınız
        ArrayList<String > ogrenciler = new ArrayList();
        ogrenciler.add("Fatma");
        ogrenciler.add("Ahmet");
        ogrenciler.add("Zeynep");
        System.out.println("ogrenciler = " + ogrenciler);

        /*ArrayList'i Doğrudan Başlatma (Arrays.asList)*/
// Soru 2 : "Ali , Veli ,Hasan " isimli öğrencilerden oluşan ogrenciler2 isimli bir ArrayList oluşturunuz.
// Ve bu listeyi yazdırınız

        List <String> ogrencilerList = Arrays.asList("Ali","Veli","Hasan");
        System.out.println("ogrencilerList = " + ogrencilerList);
       // ogrencilerList.add("Fatma"); hata veriyor
        List <String> ogrencilerList2 = new ArrayList<>(List.of("Ali","Veli","Hasan"));
        System.out.println("ogrencilerList2 = " + ogrencilerList2);
        ogrencilerList2.add("Fatma");  //new ArrayList olunca yeni eklerken hata vermiyor
        System.out.println("ogrencilerList2 = " + ogrencilerList2);

        // Soru 3 : 1 den 10 kadar olan sayılardan oluşan
// ismi "sayilar" olan bir ArryaListi for döngüsü ile oluşturunuz.
// Ve ArrayList i yazdırınız
        ArrayList<Integer> sayilar = new ArrayList<>();
        for (Integer i = 1; i < 10 ; i++) {
            sayilar.add(i);

        }
        System.out.println("sayilar = " + sayilar);
    }
}
