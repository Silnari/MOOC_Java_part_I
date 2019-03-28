import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grades grades = new Grades();

        grades.addGrades(lukija);
        grades.printGrades();
        grades.printAcceptable();
    }
}
