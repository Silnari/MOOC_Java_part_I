
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());

        if(n > 0) System.out.print("The number is positive.");
        else System.out.print("The number is not positive.");
    }
}
