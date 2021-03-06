package Service;

import Domain.Game;
import Domain.Referee;
import Domain.RepresentativeController;

public class ScheduleGames {
    RepresentativeController controller;

    public ScheduleGames() {
        this.controller = new RepresentativeController();
    }


    // date = date+ hour dd/MM/YY::HH:MM
    public boolean schedule_games(Game game, String date) {
        return controller.schedule_games(game, date);
    }
}
