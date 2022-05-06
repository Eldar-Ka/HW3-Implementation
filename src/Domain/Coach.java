package Domain;

public class Coach extends PredefinedMember {
    private Team team;
    private String birthDate;
    private String training;
    private PersonalPage personalPage;
    public Coach(String userName, String email, String password,Team team,String birthDate,String training,PersonalPage personalPage) {
        super(userName, email, password);
        this.team=team;
        this.birthDate=birthDate;
        this.training=training;
    }
    public void updateDetails () {}
    public void addContent () {}

}
