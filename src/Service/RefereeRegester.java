package Service;

import Domain.RepresentativeController;

public class RefereeRegester {
    RepresentativeController controller = new RepresentativeController();
    public void RegesterReferee(String userName, String email, String password, String training) {
        controller.RegesterReferee(userName, email, password, training);
    }
}
