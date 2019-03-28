
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int percent = Integer.parseInt(reader.nextLine());
        int grade = 0;

        if(percent <= 29) System.out.print("Grade: failed");
        else if(percent <= 34) grade = 1;
        else if(percent <=39) grade = 2;
        else if(percent <=44) grade = 3;
        else if(percent <= 49) grade = 4;
        else if(percent <= 60) grade = 5;

        if(grade!=0)
            System.out.print("Grade: " + grade);
    }
}
