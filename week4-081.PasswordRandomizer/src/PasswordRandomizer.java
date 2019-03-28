import java.util.Random;

public class PasswordRandomizer {
    private int _length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        _length = length;
    }

    public String createPassword() {
        int i = 0;
        String password = "";
        while (i < _length){
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;
            i++;
        }
        return password;
    }
}
