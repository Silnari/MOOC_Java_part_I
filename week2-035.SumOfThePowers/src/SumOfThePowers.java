
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());

        int i = 0;
        int sum = 0;
        while(i<=limit){
            sum+=(int)Math.pow(2,i);
            i++;
        }
        System.out.print("The result is " + sum);
    }
}
