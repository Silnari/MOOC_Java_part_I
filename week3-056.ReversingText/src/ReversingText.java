
import java.util.Scanner;

public class ReversingText {

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

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
