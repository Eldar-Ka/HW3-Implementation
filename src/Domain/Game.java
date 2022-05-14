package Domain;

import java.util.ArrayList;

public class Game {
    public String Gameid;
    public String Date;
    public Team hostTeam;
    public Team guestTeam;
    public String field;
    public String score;
    private EventLog eventLog;
    private League league;
    private ArrayList<Referee> referees;

    public Game(Team hostTeam, Team guestTeam, String field, String score, EventLog eventLog, League league) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.field = field;
        this.score = score;
        this.eventLog = eventLog;
        this.league = league;
        this.referees = new ArrayList<Referee>();
    }

    public void setDate(String date){
        this.Date = date;
    }
}

