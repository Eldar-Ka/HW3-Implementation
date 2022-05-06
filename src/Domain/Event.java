package Domain;

public class Event {
    private String Date;
    private String Time;
    private int minutesSinceStart;
    private EventType eventType;
    private String Description;
    private EventLog eventLog;


    public Event(String date, String time, int minutesSinceStart, EventType eventType, String description, EventLog eventLog) {
        this.Date = date;
        this.Time = time;
        this.minutesSinceStart = minutesSinceStart;
        this.eventType = eventType;
        this.Description = description;
        this.eventLog = eventLog;
    }
}
