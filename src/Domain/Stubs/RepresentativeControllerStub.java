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

}
