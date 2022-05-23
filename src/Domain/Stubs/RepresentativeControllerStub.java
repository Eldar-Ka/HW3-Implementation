package Domain.Stubs;
import Domain.*;
import DataAccess.AzureDB;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Hashtable;

public class RepresentativeControllerStub extends RepresentativeController {

    private League league;

    @BeforeAll
    public void setup(){
        league=new League();
    }

    public Boolean scheduleGameTest(Game inputGame, String inputDate){
        Team teamH=new Team("hapoel",true,null,null,league);
        Team teamG=new Team("makabi",true,null,null,league);
        String currentDate = "2022-01-01 00:00:00.000";
        if (inputGame.hostTeam.Name==teamH.Name && inputGame.guestTeam.Name==teamG.Name && currentDate==inputDate)
            return true;
        return false;
    }

    public Boolean stubRegisterReferee(String username, String email, String game_id) {
        String userPerry = "perry_cox";
        String cox_mail = "perrycox@sacredheart.com";
        String currentGameID = "1";
        if (userPerry == username && email==cox_mail && game_id==currentGameID)
            return true;
        else
            return false;
    }

}
