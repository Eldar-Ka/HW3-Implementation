package Service;
import Domain.Game;

import Domain.RepresentativeController;

public class RefereeRegister {
    RepresentativeController controller = new RepresentativeController();
    public boolean RegisterReferee(String userName, String email, String game_id) {
        return controller.RegisterReferee(userName, email, game_id);
    }
}
