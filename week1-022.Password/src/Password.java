
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        String pass = "";
        while(true){
            System.out.print("Type the password: ");
            pass = reader.nextLine();
            if(!password.equals(pass))
                System.out.print("Wrong!\n");
            else{
                System.out.print("Right!");
                System.out.print("\n\nThe secret is: jryy qbar!");
                break;
            }
        }
    }
}
