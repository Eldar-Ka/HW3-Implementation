package Integration_tests;

import Domain.EventLog;
import Domain.League;
import Domain.RepresentativeController;
import Domain.Stubs.GuestControllerStub;
import Domain.Stubs.RepresentativeControllerStub;
import Domain_tests.*;
import Service_tests.*;
import Service_tests.ScheduleGamesTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RepresentativeController_Integration {
    private League league;
    private EventLog eventLong;
//    private RepresentativeControllerStub RCStub;
    private RepresentativeControllerTest repCtest;
    private ScheduleGamesTest realScheduleTest;
    private RefereeRegisterTest realRefereeRegister;

    @BeforeAll
    public void setup(){
    System.out.println("Initiating Representative Controller Integration Tests");
    league=new League();
    eventLong=new EventLog();
    repCtest = new RepresentativeControllerTest();
    realScheduleTest= new ScheduleGamesTest();
    realRefereeRegister = new RefereeRegisterTest();
    }



    /*

    Representative Controller - First integration: Schedule Games

    */


    @Test
    @DisplayName("First part of integration testing - going through first stub")
    public void stubGameSchedule() {
        /*
        First stage of integration testing - going through the first stub.
        using the first unit test
         */
        repCtest.ScheduleGame();
    }

    @Test
    @DisplayName("Second part of integration testing - going through real function")
    public void GameSchedule() {
        /*
        Second stage of integration testing - going through real function since we
        do not have any other sub-functions under the Schedule Games function
        (going through database now)
         */
        realScheduleTest.scheduleGameError();
        realScheduleTest.scheduleGameErrorBecauseNotExist();
        realScheduleTest.scheduleGamesWithoutDate();
        realScheduleTest.scheduleGamesAlreadyHasDate();
        //realScheduleTest.deleteFromDb();//?
    }

    /*

    Representative Controller - Second integration: Schedule Games

    */


    @Test
    @DisplayName("First part of integration testing - going through first stub")
    public void stubRegisterReferee() {
        /*
        First stage of integration testing - going through the first stub.
        using the first unit test
         */
        repCtest.RegisterReferee();
    }
    @Test
    @DisplayName("Second part of integration testing - going through real function")
    public void RegisterReferee() {
        /*
        Second stage of integration testing - going through real function since we
        do not have any other sub-functions under the Register Referee functions
        (going through database now)
         */
        realRefereeRegister.refereeNotExist();
        realRefereeRegister.refereeExists();
        realRefereeRegister.emailNotExist();
        realRefereeRegister.gameNotExist();
    }







}

