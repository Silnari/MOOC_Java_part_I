
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String u1 = "alex";
        String u2 = "emily";

        String p1 = "mightyducks";
        String p2 = "cat";

        System.out.print("Type your username: ");
        String username = reader.nextLine();

        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if(u1.equals(username)){
            if(p1.equals(password))
                System.out.print("You are now logged into the system!");
            else
                System.out.print("Your username or password was invalid!");
        }
        else if(u2.equals(username)){
            if(p2.equals(password))
                System.out.print("You are now logged into the system!");
            else
                System.out.print("Your username or password was invalid!");
        }
        else System.out.print("Your username or password was invalid!");

    }
}
