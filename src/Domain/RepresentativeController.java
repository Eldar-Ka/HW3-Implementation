package Domain;

import DataAccess.AzureDB;
import DataAccess.GamesDB;
import DataAccess.UserDB;

import java.util.ArrayList;

public class RepresentativeController {
    public RepresentativeController() {
    }

    public void RegisterReferee(String userName, String email, Game game) {
        AzureDB db = UserDB.getInstance();

        // todo register an referee
    }

    public void schedule_games(Game game, String date, String hour, Referee referee) {
        AzureDB db = GamesDB.getInstance();
        // todo schedule a game
    }
}
