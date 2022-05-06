package Domain;

import java.util.ArrayList;

public class SystemManager extends PredefinedMember {
    private ArrayList<Compliant> compliants;

    public SystemManager(String userName, String email, String password) {
        super(userName, email, password);
        this.compliants = new ArrayList<Compliant>();
    }
    public void lockOutTeam (Team team) {}
    public void deletMember (Member member) {}
    public String viewCompliance () {return null;}
    public void responedCompliant (Compliant compliant) {}
    public String viewSystemLog () {return null;}
    public void activateRecommendationSystem () {}
}
