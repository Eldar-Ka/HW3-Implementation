package Domain;

import DataAccess.AzureDB;
import DataAccess.GamesDB;
import DataAccess.UserDB;

import java.util.ArrayList;

public class RepresentativeController {
    public RepresentativeController() {
    }

    public void RegisterReferee(String username, String email, String game_id) {
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

        System.out.println("Chek if game exist : ");
        sql = "Select vistoreteam ,localteam  from Users where game_id="+"'"+game_id+"'";
        ArrayList<ArrayList<String>> existGame = myDB.SelectAzureSQL(sql);

        //todo need to check it with the database
        if( existGame.isEmpty()){
            System.out.println("Game not exist");
        }
        else{
            System.out.println("Game Exist :  localteam:" +existGame.get(0).get(1)+" vistoreteam :"+existGame.get(0).get(0) );
        }

    }

    public void schedule_games(Game game, String date, String hour, Referee referee) {
        AzureDB db = GamesDB.getInstance();
        // todo schedule a game
    }
}
