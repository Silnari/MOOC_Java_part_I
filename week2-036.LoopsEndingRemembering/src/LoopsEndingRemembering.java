import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers:\n");
        int n = 0;
        int sum = 0;
        int ammount = 0;
        int on = 0;
        int en = 0;
        while(n!=-1){
            ammount++;
            sum+=n;
            n = Integer.parseInt(reader.nextLine());
            if(n%2 == 0) en++;
            else on++;
        }
        System.out.print("Thank you and see you later!\n" +
                "The sum is " + sum + "\n" +
                "How many numbers: " + (ammount - 1) + "\n" +
                "Average: " + ((float)sum/(float)(ammount -1)) + "\n" +
                "Even numbers: " + en + "\n" +
                "Odd numbers: " + (on - 1));
    }
}
