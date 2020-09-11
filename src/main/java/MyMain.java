import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        String lower = str.toLowerCase();
        int letter_count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'a'|| lower.charAt(i) == 'b'|| lower.charAt(i) == 'c') {
                letter_count = letter_count + 1;
            }
        }
        return letter_count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int a = str.indexOf("The");
        int b = str.indexOf("the");
        if (a > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String palindrome = "";
        int length = str.length();
        for (int i = length -1; i >= 0; i--) {
            palindrome = palindrome + str.charAt(i);
        }
        if (palindrome.equals(str)) {
            return true;
        }
        else {
            return false;
        }


    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your string.");
        String input = scan.nextLine();
        System.out.println("Your string has " + countABC(input) + " a's, b's, or c's.");
        System.out.println("Your string " + containsThe(input) + " contains The or the.");
        System.out.println("Your string is " + isPalindrome(input) + " palindrome.");
        System.out.println("Thanks for using!");

    }
}
