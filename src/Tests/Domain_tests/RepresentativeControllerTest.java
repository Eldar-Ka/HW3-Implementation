package Domain_tests;

import Domain.*;
import Domain.Stubs.RepresentativeControllerStub;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class RepresentativeControllerTest {

//    private RepresentativeController representativeController;
    private League league;
    private EventLog eventLong;
    private RepresentativeControllerStub RCStub;

    @BeforeAll
    public void setup(){
        league=new League();
        eventLong=new EventLog();
//        this.representativeController = new RepresentativeController();
        RCStub=new RepresentativeControllerStub();
    }

    @Test
    @DisplayName("Scheduling a game which does not exist")
    public void scheduleGameDoesNotExist() {
        Team teamH=new Team("team1",true,null,null,league);
        Team teamG=new Team("team2",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        assertFalse(RCStub.stubSchedule_games(game,"2022-01-01 00:00:00.000"));
    }

    @Test
    @DisplayName("Scheduling an existing game")
    public void scheduleGameExists(){
        Team teamH=new Team("hapoel",true,null,null,league);
        Team teamG=new Team("makabi",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        assertTrue(RCStub.stubSchedule_games(game,"2022-01-01 00:00:00.000"));
    }
//    @Test
//    @DisplayName("this test should schedule a Games")
//    public void scheduleGames() {
//        Team teamH=new Team("hapoel",true,null,null,league);
//        Team teamG=new Team("makabi",true,null,null,league);
//        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
//        assertTrue(RCStub.stubSchedule_games(game,"2022-01-01 00:00:00.000"));
//    }


    @Test
    @DisplayName("this test is for Registration of Referees")
    public void RegisterReferee() {
        assertFalse(RCStub.stubRegisterReferee("Jo", "mama", "123"));
        assertFalse(RCStub.stubRegisterReferee("bob_kelso", "perrycox@sacredheart.com", "123"));
        assertTrue(RCStub.stubRegisterReferee("bob_kelso", "perrycox@sacredheart.com", "1"));
    }

}