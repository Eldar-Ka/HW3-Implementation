package Domain;

public class Member extends User {
    private String userName;
    private String name;
    private String password;

    public Member(String userName, String name, String password) {
        this.userName = userName;
        this.name = name;
        this.password = password;
    }
    public void logOut () {}
}