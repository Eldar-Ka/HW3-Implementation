package Domain;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepresentativeControllerTest {

    private RepresentativeController representativeController;
    private League league;
    private EventLog eventLong;

    @BeforeAll
    public void setup(){
        league=new League();
        eventLong=new EventLog();
        this.representativeController = new RepresentativeController();
    }

    @Test
    @DisplayName("this test should not schedule a Games because its not found it the DB")
    public void scheduleGamesNotFound() {
        Team teamH=new Team("team1",true,null,null,league);
        Team teamG=new Team("team2",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag=this.representativeController.schedule_games(game,"2022-04-12 18:30:00.000");
        assertFalse(flag);
    }
    @Test
    @DisplayName("this test should schedule a Games")
    public void scheduleGames() {
        Team teamH=new Team("hapoel",true,null,null,league);
        Team teamG=new Team("makabi",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag=this.representativeController.schedule_games(game,"2022-01-01 00:00:00.000");
        assertTrue(flag);
    }


    @Test
    @DisplayName("this test should not register referee if he not exist")
    public void refereeNotExist() {
        boolean flag=this.representativeController.RegisterReferee("Jo", "mama", "123");
        assertFalse(flag);
    }

    @Test
    @DisplayName("this test should not register referee if the game not exist")
    public void gameNotExist() {
        boolean flag=this.representativeController.RegisterReferee("Jo", "mama", "123");
        assertFalse(flag);
    }

    @Test
    @DisplayName("this test should register referee if every thing ok")
    public void shouldExist() {
        boolean flag=this.representativeController.RegisterReferee("david", "654321", "123");
        assertTrue(flag);
    }
}