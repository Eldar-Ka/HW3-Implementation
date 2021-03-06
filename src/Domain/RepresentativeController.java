package Domain;

import DataAccess.AzureDB;

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
        sql = "Select vistoreteam ,localteam  from Games where game_id="+"'"+game_id+"'";
        ArrayList<ArrayList<String>> existGame = myDB.SelectAzureSQL(sql);

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
        String localTeam = game.hostTeam.Name;
        String vistoreteam = game.guestTeam.Name;
        String dateGame = date;
        String sql = "Select * from Games where localteam="+"'"+localTeam+"'"+"and vistoreteam="+"'"+vistoreteam+"'";
        ArrayList<ArrayList<String>> existGame = myDB.SelectAzureSQL(sql);
        if(existGame.isEmpty()) {
            System.out.println("Game not exist");
            return false;
        }
        else{
            for( ArrayList<String>row : existGame) {
                if(row.get(5) == date) {
                    System.out.println("already schedule to this date ");
                    return false;
                }
            }
            for( ArrayList<String>row : existGame) {
                if( row.get(5) == null){
                    sql = " UPDATE  Games SET localteam = "+"'" + localTeam + "'," +"vistoreteam = " + "'"+vistoreteam+"',"+ "date = "+
                            "'"+date+"'"+" Where game_id="+"'"+row.get(0)+"'";
                    return myDB.ExecuteAzureSQL(sql);
                }
            }
        }
        System.out.println("all games are scheduled");
        return false;
    }

}
