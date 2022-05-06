package Domain;

public class Member extends User {
    private String userName;
    private String email;  // todo change diagram accordingly
    private String password;

    public Member(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
    public void logOut () {}
}