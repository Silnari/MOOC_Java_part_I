
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int result = number1;
        if(result < number2) result = number2;
        if(result < number3) result = number3;
        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
