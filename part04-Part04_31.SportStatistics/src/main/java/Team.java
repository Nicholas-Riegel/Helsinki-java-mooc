public class Team {

    private String name;
    private int gamesPlayed;
    private int wins;
    private int losses;

    public Team(String name){
        this.name = name;
        this.gamesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public void incrementGamesPlayed(){
        this.gamesPlayed++;
    }

    public void incrementWins(){
        this.wins++;
    }

    public void incrementLosses(){
        this.losses++;
    }
    
    public String getName(){
        return this.name;
    }

    public int getGamesPlayed(){
        return this.gamesPlayed;
    }

    public int getWins(){
        return this.wins;
    }

    public int getLosses(){
        return this.losses;
    }
}
