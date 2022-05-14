package Service;

import Domain.EventLog;
import Domain.Game;
import Domain.League;
import Domain.Team;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;
public class ScheduleGamesTest {
    private ScheduleGames scheduleGames;


    public void setup(){
        League league=new League();
        EventLog eventLong=new EventLog();
        Team teamH=new Team("team1",true,null,null,league);
        Team teamG=new Team("team2",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
    }

    @Test
    public void scheduleGamesNotFound() {
        League league=new League();
        EventLog eventLong=new EventLog();
        Team teamH=new Team("team1",true,null,null,league);
        Team teamG=new Team("team2",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag=this.scheduleGames.schedule_games(game,"2022-04-12 18:30:00.000");
        assertFalse(flag);
    }
    @Test
    public void scheduleGames() {
        League league=new League();
        EventLog eventLong=new EventLog();
        Team teamH=new Team("hapoel",true,null,null,league);
        Team teamG=new Team("makabi",true,null,null,league);
        Game game=new Game(teamH,teamG,"barooh","1-1",eventLong,league);
        boolean flag=this.scheduleGames.schedule_games(game,"2022-01-01 00:00:00.000");
        assertTrue(flag);
    }
}