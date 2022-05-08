package Service;

import Domain.Game;
import Domain.Referee;
import Domain.RepresentativeController;

public class ScheduleGames {
    RepresentativeController controller = new RepresentativeController();
    public void schedule_games(Game game, String date, String hour, Referee referee) {
        controller.schedule_games(game, date, hour, referee);
    }
}
