package interview;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        //Bir string içinde ilk tekrar eden karakteri bulun.

       // Input:  "swiss"
       // Output: 's'
String output ="";
        char[] harfArr = "swiss".toCharArray();
        Set<Character> set = new HashSet<>();


        for (char harf : harfArr)
        while (set.contains(harf)){



        }
        System.out.println("output = " + output);


    }
}
