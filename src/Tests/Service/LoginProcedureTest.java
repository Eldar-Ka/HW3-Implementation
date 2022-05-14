package Service;

import org.junit.Test;

import static org.junit.Assert.*;


public class LoginProcedureTest {
    private LoginProcedure loginProcedure;
    @Test
    public void setup() {
        System.out.println("Instantiating Login Procedure");
        this.loginProcedure=new LoginProcedure();
    }
    @Test
    public void shouldNotExist() {
        boolean flag=this.loginProcedure.RequestLogin("Jo", "mama");
        assertFalse(flag);
    }
    @Test
    public void shouldExist() {
        boolean flag=this.loginProcedure.RequestLogin("david", "654321");
        assertFalse(flag);
    }
    @Test
    public void wrongPass() {
        boolean flag=this.loginProcedure.RequestLogin("david", "123");
        assertFalse(flag);
    }
}