package Domain;

import java.util.ArrayList;

public class Team {
    private boolean active=true;
    private PersonalPage personalPage;
    private TeamManager teamManager;
    private League league;
    private ArrayList<Player> players;
    private ArrayList<Game> games;
    private ArrayList<TeamOwner> owners;
    private ArrayList<Coach> coaches;

    public Team(boolean active, PersonalPage personalPage, TeamManager teamManager, League league) {
        this.active = active;
        this.personalPage = personalPage;
        this.teamManager = teamManager;
        this.league = league;
        this.players=new ArrayList<Player>();
        this.games=new ArrayList<Game>();
        this.owners=new ArrayList<TeamOwner>();
        this.coaches=new ArrayList<Coach>();
    }
}
