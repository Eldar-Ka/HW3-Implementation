package Domain;

import java.util.ArrayList;

public class EventLog {
    private Game game;
    private ArrayList<Event> Events;

    public EventLog(Game game) {
        this.game = game;
        this.Events = new ArrayList<Event>();
    }
}
