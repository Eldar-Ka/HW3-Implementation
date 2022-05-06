package Domain;

import java.util.ArrayList;

public class Referee extends PredefinedMember {
    private String training;
    private ArrayList<Game> gameList;

    public Referee(String userName, String email, String password,String training) {
        super(userName, email, password);
        this.training = training;
        this.gameList=new ArrayList<Game>();
    }

    public void updateDetails () {}
    public ArrayList<Game> scheduledGames () {return gameList;}
    public void updateGameEvents (Game game,Event event) {}
}
