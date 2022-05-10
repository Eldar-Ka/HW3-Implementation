package Service;
import Domain.Game;

import Domain.RepresentativeController;

public class RefereeRegister {
    RepresentativeController controller = new RepresentativeController();
    public void RegisterReferee(String userName, String email, String game_id) {
        controller.RegisterReferee(userName, email, game_id);
    }
}
