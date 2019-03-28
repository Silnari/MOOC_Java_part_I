
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account account = new Account("Konrad", 100.0);
        account.deposit(20.0);
        System.out.print(account);
    }

}
