package Domain;

public class Policy {
    private String scheduleingPolicy;
    private String scorePolicy;
    private String ratingPolicy;

    public Policy(String scheduleingPolicy, String scorePolicy, String ratingPolicy) {
        this.scheduleingPolicy = scheduleingPolicy;
        this.scorePolicy = scorePolicy;
        this.ratingPolicy = ratingPolicy;
    }
}
