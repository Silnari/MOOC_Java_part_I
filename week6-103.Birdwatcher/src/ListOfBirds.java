import java.util.ArrayList;
import java.util.Scanner;

public class ListOfBirds {
    private ArrayList<Bird> _birds;

    public ListOfBirds(){
        _birds = new ArrayList<Bird>();
    }

    private void addBird(Scanner scanner){
        System.out.print("Name: ");
        String n = scanner.nextLine();
        System.out.print("Latin Name: ");
        String ln = scanner.nextLine();
        _birds.add(new Bird(n,ln));
    }

    private void observation(Scanner scanner){
        System.out.print("What was observed:? ");
        String observed = scanner.nextLine();
        int found = 0;
        for(Bird bird: _birds){
            if(bird.get_name().equals(observed)) {
                bird._observerd++;
                found = 1;
            }
        }
        if(found == 0)
            System.out.print("Is not a bird!\n");
    }

    private void statistics(){
        for(Bird bird: _birds)
            System.out.println(bird);
    }

    private void showBird(Scanner scanner){
        System.out.print("What? ");
        String toShow = scanner.nextLine();
        int found = 0;
        for(Bird bird: _birds){
            if(bird.get_name().equals(toShow)) {
                System.out.println(bird);
                found = 1;
            }
        }
        if(found == 0)
            System.out.print("Is not a bird!\n");
    }

    public void start(Scanner scanner){
        while(true) {
            System.out.print("? ");
            String response = scanner.nextLine();

            if (response.equals("Quit")) break;

            if(response.equals("Add")){
                addBird(scanner);
            }

            if(response.equals("Observation")){
                observation(scanner);
            }

            if(response.equals("Statistics")){
                statistics();
            }

            if(response.equals("Show")){
                showBird(scanner);
            }
        }
    }
}
