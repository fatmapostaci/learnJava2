package dersler.gun49_lambda;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        //structural programming lang   -> nasıl yapmalıyım?
        for(Integer num : nums){
            System.out.println(num + " ");
        }

        //functional programming lang   -> ne yapmalıyım?

        nums.forEach( num -> System.out.print(num + " "));
        nums.forEach(System.out::print);


        //yapısal programlama
        //nesne yönelimli programlama
        //jeneric programlama
        //fonksiyonel programlama




    }
}
