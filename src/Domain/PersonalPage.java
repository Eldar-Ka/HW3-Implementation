
package Domain;

import java.util.ArrayList;

public class PersonalPage {
    private ArrayList<Member> allowedEditors;
    private ArrayList<Coach> coaches;
    private ArrayList<Player> players;
    private ArrayList<Team> teams;

    public PersonalPage(ArrayList<Member> allowedEditors) {
        this.allowedEditors = allowedEditors;
        this.coaches = new ArrayList<Coach>();
        this.players = new ArrayList<Player>();
        this.teams = new ArrayList<Team>();
    }
}
