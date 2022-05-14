package Service;

import Domain.GuestController;

public class LoginProcedure {
    GuestController controller = new GuestController();
    public boolean RequestLogin(String username, String password) {
        return controller.RequestLogin(username, password);
    }


}


