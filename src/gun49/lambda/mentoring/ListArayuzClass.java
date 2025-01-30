package gun49.lambda.mentoring;

import java.util.ArrayList;
import java.util.List;

public class ListArayuzClass {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("fatmaP","bilal","ahmet"));

        //Task1: bir list verdiğimizde listin size ını verir.
        ListArayuz  sizeOflistArayuz = listeStrings -> {  return listeStrings.size();  };

        Integer size = sizeOflistArayuz.getLengthAbstractMethod(stringList);
        System.out.println("Arraylist size = " + size);

        //Task2: toplam size ını bulalım
        ListArayuz  lenghtToplamları = listeStrings -> {
            Integer sum=0;
             for( String s :  listeStrings ){
                 sum += s.length();
             }

            return sum;
          };

        Integer toplam = lenghtToplamları.getLengthAbstractMethod(stringList);
        System.out.println("toplam = " + toplam);

        //Task3: 1.elemanının size ını alalım
        ListArayuz sizeOfFirstElement = T -> { return T.get(0).length(); };

        Integer getFirstSize = sizeOfFirstElement.getLengthAbstractMethod(stringList);
        sizeOfFirstElement.concreteSoutMethod(getFirstSize);

    }

}
