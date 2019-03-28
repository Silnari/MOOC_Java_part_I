import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics esum = new NumberStatistics();
        NumberStatistics osum = new NumberStatistics();

        System.out.println("Type numbers:");
        int n;
        while(true){
            n = Integer.parseInt(reader.nextLine());
            if(n == -1) break;
            sum.addNumber(n);
            if(n%2 == 0)
                esum.addNumber(n);
            else
                osum.addNumber(n);
        }

        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + esum.sum());
        System.out.println("sum of odd: " + osum.sum());

    }
}
