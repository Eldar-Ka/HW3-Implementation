package Domain;

import java.util.ArrayList;

public class TeamManager extends PredefinedMember {
    private ArrayList<Permission> permissionsList;
    private Team team;
    public TeamManager(String userName, String email, String password,Team team) {
        super(userName, email, password);
        this.permissionsList=new ArrayList<Permission>();
        this.team=team;
    }
    public void manageTeam () {}
}
