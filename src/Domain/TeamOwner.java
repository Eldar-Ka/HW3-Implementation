package Domain;

import java.security.Permission;
import java.util.ArrayList;

public class TeamOwner extends PredefinedMember {
    private Team team;

    public TeamOwner(String userName, String email, String password,Team team) {
        super(userName, email, password);
        this.team=team;
    }

    public void addAsset(Asset asset){

    }

    public void removeAsset(){

    }

    public void editAssetDetails(Asset asset){

    }

    public void setTeamOwner(Member m, ArrayList<Permission> pList){

    }

    public void removeTeamOwner(TeamOwner owner){

    }

    public void setManager(Member m, ArrayList<Permission> pList){

    }

    public void removeManager(Team t){

    }

    public void closeTeam(Team t){

    }

    public void reOpenTeam(Team t){

    }

    public void reportFinancialActivity(boolean income, float amount, String details){

    }

}