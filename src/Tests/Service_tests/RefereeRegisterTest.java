package Service_tests;

import Service.RefereeRegister;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;

//import static org.junit.Assert.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RefereeRegisterTest {

    private RefereeRegister refereeRegister;

    @BeforeAll
    public void setup() {
        System.out.println("Instantiating Referee Register");
        this.refereeRegister = new RefereeRegister();
    }

    @Test
    public void refereeNotExist() {
        boolean flag=this.refereeRegister.RegisterReferee("Jo", "mama", "123");
        assertFalse(flag);
    }

    @Test
    public void gameNotExist() {
        boolean flag=this.refereeRegister.RegisterReferee("Jo", "mama", "123");
        assertFalse(flag);
    }

    @Test
    public void shouldExist() {
        boolean flag=this.refereeRegister.RegisterReferee("david", "654321", "123");
        assertFalse(flag);
    }
}