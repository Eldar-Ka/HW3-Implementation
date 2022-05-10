package Domain;

import DataAccess.AzureDB;
import DataAccess.GamesDB;
import DataAccess.UserDB;

import java.util.ArrayList;

public class RepresentativeController {
    public RepresentativeController() {
    }

    public void RegisterReferee(String username, String email, Game game) {
        AzureDB myDB = new AzureDB();
        String sql = "Select username,email from Users where username="+"'"+username+"'"+" and"+" email="+"'"+email+"'";
        ArrayList<ArrayList<String>> existRef = myDB.SelectAzureSQL(sql);

        if (existRef.isEmpty() ) {
            System.out.println("Referee username Does Not Exist or email is Wrong");
        }
        else {
            System.out.println(existRef);
            System.out.println("Username : " + existRef.get(0).get(0) + " Email: " + existRef.get(0).get(1) + " refereeExists");
        }
        // todo register an referee
    }

    public void schedule_games(Game game, String date, String hour, Referee referee) {
        AzureDB db = GamesDB.getInstance();
        // todo schedule a game
    }
}
