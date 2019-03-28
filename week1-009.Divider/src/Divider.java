
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        float n1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        float n2 = Integer.parseInt(reader.nextLine());

        System.out.print("Division: " + n1 + " / " + n2 + " = " + (n1/n2));
    }
}
