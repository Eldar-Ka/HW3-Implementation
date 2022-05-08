package Service;

import Domain.Guest;

public class LoginProcedure {
//    UserController controller = new UserController();
    public void RequestLogin(Guest guest, String username, String password) {
//        controller.RequestLogin(username, password);
        guest.login(username, password);
    }
}
