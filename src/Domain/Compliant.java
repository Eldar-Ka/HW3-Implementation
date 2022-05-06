package Domain;

import java.util.ArrayList;

public class Compliant {
    private Fan fan;
    private String content;
    private ArrayList<SystemManager> SystemManagers;

    public Compliant(Fan fan, String content, SystemManager systemManager) {
        this.fan = fan;
        this.content = content;
        this.SystemManagers = new ArrayList<SystemManager>();
        this.SystemManagers.add(systemManager);
    }
}
