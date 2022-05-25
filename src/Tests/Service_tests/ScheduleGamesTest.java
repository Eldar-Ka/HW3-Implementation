package Service_tests;

import DataAccess.AzureDB;
import Domain.EventLog;
import Domain.Game;
import Domain.League;
import Domain.Team;

import Service.ScheduleGames;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScheduleGamesTest {

    ScheduleGames schedules = new ScheduleGames();;
    League league;
    EventLog eventLong;

    @BeforeEach
    public void setupAll(){
        System.out.println("Testing For Schedule Games: ");
    }



    @BeforeEach
    public void setup(){
        System.out.println("Instantiating League,EventLog");
        league=new League();
        eventLong=new EventLog();
        schedules = new ScheduleGames();
    }
    /*
    Test 2 - Scheduling games - we need to check if game does not exist in the DB, if it does, return false,
    if it doesn't - return true -> which means the game has been scheduled.
    Test 1 - Scheduling games, game already exists = fail.
     */

    @Test
    @DisplayName("this test should not schedule a Games because it already has a date")
    public void  scheduleGameError(){
        Team teamH = new Team("team1",true,null,null,league);
        Team teamG = new Team("team2",true,null,null,league);
        Game game = new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag = schedules.schedule_games(game,"2022-04-12 18:30:00.000");
        assertFalse(flag);
    }


    @Test
    @DisplayName("this test should not schedule a Games because it not exist")
    public void  scheduleGameErrorBecauseNotExist(){
        Team teamH = new Team("team3",true,null,null,league);
        Team teamG = new Team("team4",true,null,null,league);
        Game game = new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag = schedules.schedule_games(game,"2022-04-12 18:30:00.002");
        assertFalse(flag);
    }


    //===================================================================================

    @Test
    @DisplayName("this test should schedule a Games if the game dont have date, else will fail")
    public void scheduleGamesWithoutDate() {
        Team teamH=new Team("Macabi TA",true,null,null,league);
        Team teamG=new Team("Hapoel H",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag=this.schedules.schedule_games(game,"2022-01-01 00:00:00.000");
        assertTrue(flag);
    }


    @Test
    @DisplayName("this test should return error since game already has a date")
    public void scheduleGamesAlreadyHasDate() {
        Team teamH=new Team("Macabi TA",true,null,null,league);
        Team teamG=new Team("Hapoel H",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag=this.schedules.schedule_games(game,"2022-01-01 00:00:00.001");
        assertFalse(flag);
    }
    //===================================================================================

    /*
     Since the test scheduleGamesWithoutDate schedules a date,
     we need to delete it after the test
     */
    @AfterAll
    public void deleteFromDb() {
        System.out.println("here ");
        AzureDB db = new AzureDB();
        String  sql = "UPDATE  Games SET date = NULL Where localteam= 'Macabi TA' and vistoreteam= 'Hapoel H'";
        db.ExecuteAzureSQL(sql);
    }

}