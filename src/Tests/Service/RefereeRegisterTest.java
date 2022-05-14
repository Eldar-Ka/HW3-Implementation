package Service;

import org.junit.Test;

import static org.junit.Assert.*;

public class RefereeRegisterTest {
    private RefereeRegister refereeRegister;

    @Test
    public void setup() {
        System.out.println("Instantiating Referee Register");
        this.refereeRegister = RefereeRegister();
    }
    @Test
    public void shouldNotExist() {
        boolean flag=this.refereeRegister.RegisterReferee("Jo", "mama", "123");
        assertFalse(flag);
    }
    @Test
    public void shouldExist() {
        boolean flag=this.refereeRegister.RegisterReferee("david", "654321", "123");
        assertFalse(flag);
    }
}