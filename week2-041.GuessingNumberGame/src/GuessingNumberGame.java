
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int tries = 1;
        while(true){
            if(guess == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            if(guess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + tries);
                tries++;
                System.out.println("Guess a number: ");
                guess = Integer.parseInt(reader.nextLine());
            }
            if(guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + tries);
                tries++;
                System.out.println("Guess a number: ");
                guess = Integer.parseInt(reader.nextLine());
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
