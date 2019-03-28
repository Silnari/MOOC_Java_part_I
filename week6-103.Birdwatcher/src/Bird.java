public class Bird {
    private String _name;
    private String _latinName;
    public int _observerd;

    public Bird(String name, String latinName){
        _name = name;
        _latinName = latinName;
        _observerd = 0;
    }

    public String get_name() {
        return _name;
    }

    @Override
    public String toString() {
        return _name + " (" + _latinName + "): " + _observerd + " observations";
    }
}
