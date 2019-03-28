public class Person {
    private String _name;
    private String _phoneNumber;

    public Person(String name, String phoneNumber){
        _name = name;
        _phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return _phoneNumber;
    }

    public String getName() {
        return _name;
    }

    public void changeNumber(String newNumber){
        _phoneNumber = newNumber;
    }

    @Override
    public String toString() {
        return _name + "  number: " + _phoneNumber;
    }
}
