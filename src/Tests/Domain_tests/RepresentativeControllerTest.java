package Domain_tests;

import Domain.*;
import Domain.Stubs.RepresentativeControllerStub;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class RepresentativeControllerTest {

//    private RepresentativeController representativeController;
    private League league;
    private EventLog eventLong;
    private RepresentativeControllerStub RCStub = new RepresentativeControllerStub();

    @BeforeAll
    public void setup(){
        eventLong=new EventLog();
    }


    @Test
    @DisplayName("this test is for Registration of Referees")
    public void RegisterReferee() {
        assertFalse(RCStub.stubRegisterReferee("Jo", "mama", "123"));
        assertFalse(RCStub.stubRegisterReferee("Jo", "mama", "1"));
        assertFalse(RCStub.stubRegisterReferee("Jo", "perrycox@sacredheart.com", "1"));
        assertFalse(RCStub.stubRegisterReferee("Jo", "perrycox@sacredheart.com", "123"));
        assertFalse(RCStub.stubRegisterReferee("perry_cox", "perrycox@sacredheart.com", "123"));
        assertFalse(RCStub.stubRegisterReferee("perry_cox", "mama", "1"));
        assertFalse(RCStub.stubRegisterReferee("perry_cox", "mama", "123"));
        assertTrue(RCStub.stubRegisterReferee("perry_cox", "perrycox@sacredheart.com", "1"));
    }

}