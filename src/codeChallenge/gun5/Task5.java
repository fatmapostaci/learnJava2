package codeChallenge.gun5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    /*
  ismi getCount() olan bir method oluşturun.
//        Parametre olarak bir String ArayList  ve  bir tane String

  Return tipi int olmalı.

  ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
  Örneğin;
  ArrayList = Orange , Kiwi , Peach , Banana , Orange
  String Orange:
  Count = 2 olmalı. (Orange 2 kez yazılmış)
   */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("Orange", "Kiwi", "Orange", "Banana", "Orange"));
        System.out.println(getCount(arrayList, "Orange"));
    }

    public static int getCount(ArrayList<String> arrL, String s) {
        int counter = 0;
        for (String stringArray : arrL) {
            if (s.equals(stringArray)) {
                counter++;
            }
        }
        return counter;
    }
}
