package Domain;

import DataAccess.AzureDB;
import DataAccess.GamesDB;
import DataAccess.UserDB;

import java.util.ArrayList;

public class RepresentativeController {
    public RepresentativeController() {
    }

    public boolean RegisterReferee(String username, String email, String game_id) {
        AzureDB myDB = new AzureDB();
        String sql = "Select username,email from Users where username="+"'"+username+"'"+" and"+" email="+"'"+email+"'";
        ArrayList<ArrayList<String>> existRef = myDB.SelectAzureSQL(sql);

        if (existRef.isEmpty() ) {
            System.out.println("Referee username Does Not Exist or email is Wrong");
            return false;
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
            return false;
        }
        else{
            System.out.println("Game Exist :  localteam:" +existGame.get(0).get(1)+" vistoreteam :"+existGame.get(0).get(0) );
        }

        sql = "Insert into Games (mainJudge) values"+"'"+username+"'"+"where game_id="+"'"+game_id+"'";
        myDB.ExecuteAzureSQL(sql);

    return true;
    }

    public boolean schedule_games(Game game, String date) {
        AzureDB myDB = new AzureDB();
        String game_id = game.Gameid;
        String sql = "Select * from Games where game_id="+"'"+game_id+"'";
        ArrayList<ArrayList<String>> existGame = myDB.SelectAzureSQL(sql);
        //todo need to check it with the database
        if( existGame.isEmpty()) {
            System.out.println("Game not exist");
            return false;
        }
         sql = " Insert Into Games(date) values" + "'" + date + "'" + "where game_id=" + "'" + game_id + "'";
        //need to check it with the league ruls, but not implemnted league ruls in the requirement
        System.out.println("game scheduled");
        return myDB.ExecuteAzureSQL(sql);

    }

}
