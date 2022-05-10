package Service;
import Domain.Game;

import Domain.RepresentativeController;

public class RefereeRegister {
    RepresentativeController controller = new RepresentativeController();
    public void RegisterReferee(String userName, String email, Game game) {
        controller.RegisterReferee(userName, email, game);
    }
}
