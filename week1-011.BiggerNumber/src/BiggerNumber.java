
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type a number: ");
        int n2 = Integer.parseInt(reader.nextLine());

        System.out.print("The bigger number of the two numbers given was: " + Math.max(n1,n2));
    }
}
