import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if(players.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for(Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.maxSize;
    }

    public int goals() {
        int number = 0;
        for(Player player : this.players) {
            number += player.getGoals();
        }
        return number;
    }
}
