package interview;

public class polindromString {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {

        StringBuilder stringtoCompare=new StringBuilder(input);
        stringtoCompare.reverse();

        if(input.equals(stringtoCompare.toString()))
            return true;
        else return false;
    }
}
