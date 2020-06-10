package inf5153.Rules.Actions;

import inf5153.Controllers.GameController;

public class EndGameAction implements Action {

    @Override
    public boolean execute(GameController controller) {
        return true;
    }

    @Override
    public boolean isAllowed(GameController controller) {
        return true;
    }

    @Override
    public String toString() {
        return "End the game";
    }
}
