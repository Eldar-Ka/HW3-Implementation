package Service;

import Domain.Game;
import Domain.Referee;
import Domain.RepresentativeController;

public class ScheduleGames {
    RepresentativeController controller = new RepresentativeController();

    // date = date+ hour dd/MM/YY::HH:MM
    public void schedule_games(Game game, String date) {
        controller.schedule_games(game, date);
    }
}
