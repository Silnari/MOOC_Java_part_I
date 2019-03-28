public class Player {
    private String _name;
    private int _goals;

    public Player(String name){
        this(name,0);
    }

    public Player(String name, int goals){
        _name = name;
        _goals = goals;
    }

    public int goals() {
        return _goals;
    }

    public String getName() {
        return _name;
    }

    @Override
    public String toString() {
        return _name + ", goals " + _goals;
    }
}
