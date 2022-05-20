package Service_tests;

import Service.LoginProcedure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class LoginProcedureTest {
    private LoginProcedure loginProcedure;


    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Login Procedure");
        this.loginProcedure=new LoginProcedure();
    }

    @Test
    @DisplayName("this test should not login because the user does not exist")
    public void shouldNotExist() {
        boolean flag=this.loginProcedure.RequestLogin("Jo", "mama");
        assertFalse(flag);
    }
    @Test
    @DisplayName("this test should login an existing member")
    public void shouldExist() {
        boolean flag=this.loginProcedure.RequestLogin("david", "654321");
        assertFalse(flag);
    }
    @Test
    @DisplayName("this test should not login an existing member because of a wrong password")
    public void wrongPass() {
        boolean flag=this.loginProcedure.RequestLogin("david", "123");
        assertFalse(flag);
    }
}