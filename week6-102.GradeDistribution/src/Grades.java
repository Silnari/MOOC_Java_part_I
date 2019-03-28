import java.util.Scanner;

public class Grades {
    private int[] grades = new int[6];

    public Grades(){
        for(int i = 0; i < 6; i++){
            grades[i] = 0;
        }
    }

    public void addGrades(Scanner scanner){
        System.out.print("Type exam scores, -1 completes:\n");
        while(true){
            int grade = Integer.parseInt(scanner.nextLine());
            if(grade == -1) break;
            else if(grade <0) continue;
            else if(grade <= 29) grades[0]++;
            else if(grade <= 34) grades[1]++;
            else if(grade <=39) grades[2]++;
            else if(grade <=44) grades[3]++;
            else if(grade <= 49) grades[4]++;
            else if(grade <= 60) grades[5]++;
        }

    }

    public void printGrades(){
        String star = "*";
        System.out.print("Grade distribution:\n");
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for(int j = 0; j < grades[i]; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public void printAcceptable(){
        double accepted = 0;
        for(int i = 1; i < 6; i++){
            accepted += grades[i];
        }
        System.out.print("Acceptance percentage: " + (100*accepted/(accepted + grades[0])));
    }

}
