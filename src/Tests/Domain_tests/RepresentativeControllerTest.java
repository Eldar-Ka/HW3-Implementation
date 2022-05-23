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
        RCStub=new RepresentativeControllerStub();
    }


    @Test
    @DisplayName("this test is for Registration of Referees")
    public void RegisterReferee() {
        assertFalse(RCStub.stubRegisterReferee("Jo", "mama", "123"));
        assertFalse(RCStub.stubRegisterReferee("Jo", "mama", "1"));
        assertFalse(RCStub.stubRegisterReferee("Jo", "perrycox@sacredheart.com", "1"));
        assertFalse(RCStub.stubRegisterReferee("Jo", "perrycox@sacredheart.com", "123"));
        assertFalse(RCStub.stubRegisterReferee("perry_cox", "perrycox@sacredheart.com", "123"));
        assertFalse(RCStub.stubRegisterReferee("perry_cox", "mama", "1"));
        assertFalse(RCStub.stubRegisterReferee("perry_cox", "mama", "123"));
        assertTrue(RCStub.stubRegisterReferee("perry_cox", "perrycox@sacredheart.com", "1"));
    }


    @Test
    @DisplayName("this test is for Schedule Game")
    public void ScheduleGame() {
        Team currectTeamH=new Team("hapoel",true,null,null,league);
        Team wrongTeamH=new Team("wrong",true,null,null,league);
        Team currectTeamG=new Team("makabi",true,null,null,league);
        Team wrongTeamG=new Team("wrong",true,null,null,league);
        Game currectGame=new Game(currectTeamH,currectTeamG,"barooh",null,eventLong,league);
        Game wrongGame1=new Game(currectTeamH,wrongTeamG,"barooh",null,eventLong,league);
        Game wrongGame2=new Game(wrongTeamH,currectTeamG,"barooh",null,eventLong,league);
        Game wrongGame3=new Game(wrongTeamH,wrongTeamG,"barooh",null,eventLong,league);
        String currectDate = "2022-01-01 00:00:00.000";
        String wrongDate = "1997-01-01 00:00:00.000";
        assertFalse(RCStub.scheduleGameTest(currectGame, wrongDate));
        assertFalse(RCStub.scheduleGameTest(wrongGame1, currectDate));
        assertFalse(RCStub.scheduleGameTest(wrongGame1, wrongDate));
        assertFalse(RCStub.scheduleGameTest(wrongGame2, currectDate));
        assertFalse(RCStub.scheduleGameTest(wrongGame2, wrongDate));
        assertFalse(RCStub.scheduleGameTest(wrongGame3, currectDate));
        assertFalse(RCStub.scheduleGameTest(wrongGame3, wrongDate));
        assertTrue(RCStub.scheduleGameTest(currectGame, currectDate));

    }


}