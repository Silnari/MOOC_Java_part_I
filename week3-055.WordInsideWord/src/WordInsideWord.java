
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String txt1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String txt2 = reader.nextLine();

        if(txt1.indexOf(txt2)!= -1){
            System.out.print("The word '" + txt2 + "' is found in the word '" + txt1 + "'.\n");
        }
        else
            System.out.print("The word '" + txt2 + "' is not found in the word '" + txt1 + "'.\n");

    }
}
