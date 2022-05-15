package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class GuestControllerTest {
    private GuestController guestController;


    @BeforeAll
    public void setup() {
        System.out.println("Instantiating Login Procedure");
        this.guestController=new GuestController();
    }

    @Test
    @DisplayName("this test should not login because the user does not exist")
    public void shouldNotExist() {
        boolean flag=this.guestController.RequestLogin("Jo", "mama");
        assertFalse(flag);
    }
    @Test
    @DisplayName("this test should login an existing member")
    public void shouldExist() {
        boolean flag=this.guestController.RequestLogin("david", "654321");
        assertFalse(flag);
    }
    @Test
    @DisplayName("this test should not login an existing member because of a wrong password")
    public void wrongPass() {
        boolean flag=this.guestController.RequestLogin("david", "123");
        assertFalse(flag);
    }
}