package Integration_tests;

import Domain_tests.*;
import Service_tests.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GuestController_Integration {
    private GuestControllerTest guestControllerTest = new GuestControllerTest();
    private LoginProcedureTest realLoginTest = new LoginProcedureTest();

    @Test
    @DisplayName("First part of integration testing - going through first stub")
    public void stubRequestLogin() {
        /*
        First stage of integration testing - going through the first stub.
        using the first unit test.
         */
        guestControllerTest.userExists();
        guestControllerTest.userDoesNotExist();
        guestControllerTest.wrongPass();
    }

    @Test
    @DisplayName("Second part of integration testing - going through real function")
    public void RequestLogin() {
        /*
        Second stage of integration testing - going through real function since we
        do not have any other sub-functions under the Request Login function
        (going through database now)
         */
        realLoginTest.shouldExist();
        realLoginTest.shouldNotExist();
        realLoginTest.wrongPass();
    }


}
