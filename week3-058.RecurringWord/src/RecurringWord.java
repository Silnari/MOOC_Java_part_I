
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String temp = reader.nextLine();
            if(words.contains(temp)){
                System.out.print("You gave the word " + temp + " twice");
                break;
            }
            else words.add(temp);
        }
    }
}
