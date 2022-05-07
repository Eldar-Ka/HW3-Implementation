package Domain;

import java.util.ArrayList;

public class Policy {
    private String scheduleingPolicy;
    private String scorePolicy;
    private String ratingPolicy;
    private League league;
    private Season season;

    public Policy(String scheduleingPolicy, String scorePolicy, String ratingPolicy, League league, Season season) {
        this.scheduleingPolicy = scheduleingPolicy;
        this.scorePolicy = scorePolicy;
        this.ratingPolicy = ratingPolicy;
        this.league = league;
        this.season = season;
    }
}
