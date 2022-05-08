package Domain;

import DataAccess.AzureDB;
import DataAccess.GamesDB;
import DataAccess.UserDB;

public class RepresentativeController {
    public RepresentativeController() {
    }

    public void RegesterReferee(String userName, String email, String password, String training) {
        AzureDB db = UserDB.getInstance();
        // todo register an referee
    }

    public void schedule_games(Game game, String date, String hour, Referee referee) {
        AzureDB db = GamesDB.getInstance();
        // todo schedule a game
    }
}
