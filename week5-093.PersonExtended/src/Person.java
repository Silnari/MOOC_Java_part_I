import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name){
        this.name = name;
        birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public int age() {
        MyDate actuallDate = new MyDate(
                Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
        int temp = actuallDate.differenceInYears(birthday);
        return temp;
    }
    
    public boolean olderThan(Person compared) {
        if(birthday.earlier(compared.birthday))
            return true;
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
