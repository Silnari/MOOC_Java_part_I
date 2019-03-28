
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        if(year%4 == 0 ) {
            if(year%100 == 0){
                if(year%400 == 0)
                    System.out.print("The year is a leap year.");
                else
                    System.out.print("The year is not a leap year.");
            }
            else
                System.out.print("The year is a leap year.");
        }
        else
            System.out.print("The year is not a leap year.");
    }
}
