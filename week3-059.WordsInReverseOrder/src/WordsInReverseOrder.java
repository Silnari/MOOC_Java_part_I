import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String temp = reader.nextLine();
            if(temp.equals("")) break;
            else words.add(temp);
        }
        Collections.reverse(words);
        System.out.print("You typed the following words:");
        for(String word : words)
            System.out.println(word);
    }
}
