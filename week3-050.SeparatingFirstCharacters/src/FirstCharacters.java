import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        if(name.length() >= 3){
            System.out.print("1. character: " + character(name,0));
            System.out.print("2. character: " + character(name,1));
            System.out.print("3. character: " + character(name,2));
        }
    }

    public static char character(String text, int index){
        return text.charAt(index);
    }
}
