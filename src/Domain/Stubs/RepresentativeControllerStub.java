package Domain.Stubs;

import DataAccess.AzureDB;
import Domain.Game;
import Domain.RepresentativeController;

import java.util.ArrayList;
import java.util.Hashtable;

public class RepresentativeControllerStub extends RepresentativeController {
    public Boolean stubSchedule_games(Game game, String date){
        return "1".equals(game.Gameid) && "2022-01-01 00:00:00.000".equals(date);
    }
    public Boolean stubRegisterReferee(String username, String email, String game_id) {
        return ("bob_kelso".equals(username)||"perry_cox".equals(username))&&("1".equals(game_id)||"2".equals(game_id));
    }
//    public boolean schedule_games(Game game, String date) {
//        Hashtable<Game, String> DBStub = new Hashtable<>();
//        return true;







        //        AzureDB myDB = new AzureDB();
//        String game_id = game.Gameid;
//        String sql = "Select * from Games where game_id="+"'"+game_id+"'";
//        ArrayList<ArrayList<String>> existGame = myDB.SelectAzureSQL(sql);
//        if( existGame.isEmpty()) {
//            System.out.println("Game not exist");
//            return false;
//        }
//        sql = " Insert Into Games(date) values" + "'" + date + "'" + "where game_id=" + "'" + game_id + "'";
//        //need to check it with the league ruls, but not implemnted league ruls in the requirement
//        System.out.println("game scheduled");
//        return myDB.ExecuteAzureSQL(sql);


}
