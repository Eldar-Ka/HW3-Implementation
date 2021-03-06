package Domain_tests;

import Domain.Stubs.GuestControllerStub;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.jupiter.api.*;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.assertFalse;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class GuestControllerTest {
    private GuestControllerStub guestControllerStub = new GuestControllerStub();




    @Test
    @DisplayName("this test should login an existing member")
    public void userExists() {
        boolean flag=this.guestControllerStub.RequestLogin("david", "654321");
        assertTrue(flag);
    }
    @Test
    @DisplayName("this test should not login an existing member because of a wrong password")
    public void wrongPass() {
        boolean flag=this.guestControllerStub.RequestLogin("david", "123");
        assertFalse(flag);
    }
    @Test
    @DisplayName("this test should not login because the user does not exist")
    public void userDoesNotExist() {
        boolean flag=this.guestControllerStub.RequestLogin("Jo", "654321");
        assertFalse(flag);
    }
}