package dersler.gun51.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_Match {
    public static void main(String[] args) {

        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "büryan", "Melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("***Task01****");
        // Task01->  Listte bulunan tüm  elemanlarin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.
        String yedidenBuukOlanlar =  yemahhh.stream()
                        .allMatch(t->t.length()<=7)?"Butun elemanlar 7 ve daha az karakterden oluşuyor" : "En az 1 elemanın karakter sayısı 7den fazla";


        System.out.println();
        System.out.println("\n***Task02****");
        // Task02-> List elemanlarinin hicbirinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch

        System.out.println();
        System.out.println("\n***Task03****");
        // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->

    }
}
