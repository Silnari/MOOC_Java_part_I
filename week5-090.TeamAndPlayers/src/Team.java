import java.util.ArrayList;

public class Team {
    private String _name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int _maxSize;

    public Team(String name){ _name = name; _maxSize = 16; }

    public String getName() {
        return _name;
    }

    public void addPlayer(Player player){
        if(!players.contains(player) && players.size() < _maxSize) {
            players.add(player);
        }
    }

    public void printPlayers(){
        for(Player player: players)
            System.out.println(player);
    }

    public void setMaxSize(int maxSize){
        _maxSize = maxSize;
    }

    public int size(){
        return players.size();
    }

    public int goals(){
        int goals = 0;
        for(Player player: players){
            goals += player.goals();
        }
        return goals;
    }
}
