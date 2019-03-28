
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int f = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int s = Integer.parseInt(reader.nextLine());

        while(f<=s){
            System.out.println(f);
            f++;
        }
    }
}
