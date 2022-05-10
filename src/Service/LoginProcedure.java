package Service;

import Domain.GuestController;

public class LoginProcedure {
    GuestController controller = new GuestController();
    public void RequestLogin(String username, String password) {
        controller.RequestLogin(username, password);
    }



}


