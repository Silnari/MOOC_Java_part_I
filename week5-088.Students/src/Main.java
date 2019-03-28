
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while(true){
            System.out.print("Name: ");
            String name = reader.nextLine();
            if(name.equals("")) break;
            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();
            list.add(new Student(name,studentnumber));
        }

        for(Student student: list)
            System.out.println(student);

        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.print("Result:\n");
        for(Student student: list){
            if(student.getName().contains(search))
                System.out.print(student);

        }
    }
}
