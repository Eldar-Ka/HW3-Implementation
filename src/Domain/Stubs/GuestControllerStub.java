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
        String currentUser = "david";
        String currentPassword = "654321";
        if(currentUser==username && currentPassword==password)
            return true;
        return false;
    }


}
