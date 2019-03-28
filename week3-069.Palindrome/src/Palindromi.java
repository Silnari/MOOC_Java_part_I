import java.util.Collections;
import java.util.Scanner;

public class Palindromi {

    public static char getChar(String text, int index){
        return text.charAt(index);
    }

    public static String reverse(String text) {
        String temp = "";
        for(int i = text.length() - 1; i >= 0; i--){
            temp = temp + getChar(text,i);
        }
        return temp;
    }

    public static boolean palindrome(String text) {
        String reversed = reverse(text);

        if(reversed.equals(text)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
