package Domain;

public class MainReferee extends Referee{
    public MainReferee(String userName, String email, String password, String training) {
        super(userName, email, password, training);
    }
    public void editGameEvents (Game game,Event event) {}
    public String produceReport (Game game) {return null;}
}
