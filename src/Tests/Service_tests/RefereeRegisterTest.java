package Service_tests;

import Service.RefereeRegister;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.Assert.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RefereeRegisterTest {

    private RefereeRegister refereeRegister = new RefereeRegister();

    @BeforeAll
    public void setup() {
        System.out.println("Instantiating Referee Register");
//        this.refereeRegister = new RefereeRegister();
    }

    @Test
    @DisplayName("In this test we will try registering a referee which does not exists " +
            " to a game - expected false.")
    public void refereeNotExist() {
        boolean flag = this.refereeRegister.RegisterReferee("Jo", "mama", "123");
        assertFalse(flag);
    }

    @Test
    @DisplayName("This test should register a referee to an existing game - expected true")
    public void refereeExists() {
        boolean flag = this.refereeRegister.RegisterReferee("bob_kelso", "bobkelso@sacredheart.com", "3");
        assertTrue(flag);
    }
    @Test
    @DisplayName("In this test we will try registering a referee with emil which does match the userName " +
            " to a game - expected false.")
    public void emailNotExist() {
        boolean flag = this.refereeRegister.RegisterReferee("bob_kelso", "mama", "123");
        assertFalse(flag);
    }
    @Test
    @DisplayName("In this test we will try to register a referee to a game" +
            "which does not exists - expected false.")
    public void gameNotExist() {
        boolean flag = this.refereeRegister.RegisterReferee("bob_kelso", "bobkelso@sacredheart.com", "123");
        assertFalse(flag);
    }




}

