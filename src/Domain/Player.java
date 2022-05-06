package Domain;

public class Player extends PredefinedMember {
    private Team team;
    private String birthDate;
    private String role;
    private PersonalPage personalPage;
    public Player(String userName, String email, String password,Team team,String birthDate,String role,PersonalPage personalPage) {
        super(userName, email, password);
        this.team=team;
        this.birthDate=birthDate;
        this.role=role;
        this.personalPage=personalPage;
    }
    public void updateDetails () {}
    public void addContent () {}

}
