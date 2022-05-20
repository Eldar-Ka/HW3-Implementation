package Domain;

import java.util.ArrayList;

public class Permission {
    public TeamManager teamManager;
    public String description;

    public Permission(TeamManager teamManager, String description) {
        this.teamManager = teamManager;
        this.description = description;
    }
}
