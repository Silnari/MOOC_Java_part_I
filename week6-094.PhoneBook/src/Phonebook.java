import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> people;

    public Phonebook(){
        people = new ArrayList<Person>();
    }

    public void add(String name, String number){
        people.add(new Person(name,number));
    }

    public void printAll(){
        for(Person person: people){
            System.out.println(person);
        }
    }

    public String searchNumber(String name){
        for(Person person: people){
            if(person.getName().contains(name))
                return person.getNumber();
        }
        return "number not known";
    }
}
