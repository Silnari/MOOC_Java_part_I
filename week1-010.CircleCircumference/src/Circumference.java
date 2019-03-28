
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        float radius = Float.parseFloat(reader.nextLine());

        System.out.print("Circumference of the circle: " + (radius * 2 * Math.PI));
    }
}
