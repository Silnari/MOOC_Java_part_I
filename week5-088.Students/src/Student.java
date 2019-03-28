public class Student {
    private String _name;
    private String _studentNumber;

    public Student(String name, String studentNumber){
        _name = name;
        _studentNumber = studentNumber;
    }

    public String getName(){
        return _name;
    }

    public String getStudentNumber(){
        return _studentNumber;
    }

    @Override
    public String toString() {
        return _name + " (" + _studentNumber + ")";
    }
}
