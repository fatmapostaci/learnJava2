package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicatsOfString {

    public static void main(String[] args) {
        String input = "Test Automation";


        findDuplicates(input);

    }

    private static void findDuplicates(String input) {

        String[] arrInput = input.toLowerCase().replace(" ", "").split("");
        int counter = 0;
        Map<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < arrInput.length; i++) {


            for (int j = i; j < arrInput.length; j++) {
                if (arrInput[i].equals(arrInput[j])) {
                    counter++;
                }
            }
            for (int j = i; j < arrInput.length; j++) {
                if (!arrInput[i].contains(arrInput[j])) {
                    duplicates.put(arrInput[i], counter);
                }
                //               if (!input.substring(i, i + 1).contains(arrInput[i])) {
            }
            System.out.println(arrInput[i] + "  " + duplicates.get(arrInput[i]));
        }

        System.out.println(duplicates);
    }
}
/*
    private static void findDuplicates(String input) {
        input = input.toLowerCase();
        String foundChars = "";
        for (int i = 0; i < input.length() - 1; i++) {
            char temp = input.charAt(i);

            for (int j = i; j < input.length() - 1; j++) {

                if (temp == input.charAt(j)) {
                    if (!foundChars.contains(Character.toString(temp)))
                        foundChars += temp;
                }

            }
        }

        System.out.println(foundChars);
    }*/

