package Domain.Stubs;

import DataAccess.AzureDB;
import Domain.Game;
import Domain.GuestController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class GuestControllerStub extends GuestController {

    public boolean RequestLogin(String username, String password) {
        return "david".equals(username) && "654321".equals(password);

    }


}
