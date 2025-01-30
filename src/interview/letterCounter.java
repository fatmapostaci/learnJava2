package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class letterCounter {
    public static void main(String[] args) {

        // String te tekrarlayan karakterleri ve tekrarlama sayılarını yazdırın
        String input = "Test Automation";
        findDuplicates(input);

    }

    private static void findDuplicates(String input) {
        input=input.toLowerCase();
        Map<Character, Integer> foundCharsMap = new HashMap<>();
        for (int i = 0; i < input.length() - 1; i++) {


//            int counter = 0;
//            char temp = input.charAt(i);
//            foundCharsMap.put(temp, counter);
//            for (int j = i; j < input.length() - 1; j++) {
//
//                if (temp == input.charAt(j)) {
//                    if (!foundCharsMap.containsKey(Character.toString(temp)))
//                        foundCharsMap.put(temp, counter);
//                    else {
//
//                        counter++;
//                       foundCharsMap.put(temp, counter);
//                    }
//                    foundCharsMap.get(temp);
//                }
//
//            }
            System.out.println(foundCharsMap.toString());
        }
    }
}
