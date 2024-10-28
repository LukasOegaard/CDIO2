package game;

import game.model.Player;
import game.controller.DieController;
import game.controller.PlayerController;
import game.controller.TileController;
import game.controller.UIController;

public class Game {

    private static Game instance;
    private boolean running;
    private PlayerController playerController;
    private DieController dieController;
    private TileController tileController;
    private UIController uiController;

    public static void main(String[] args) {
        getInstance().startGame();
    }

    private Game() {
        this.running = true;
        this.playerController = PlayerController.getInstance();
        this.dieController = DieController.getInstance();
        this.tileController = TileController.getInstance();
        this.uiController = UIController.getInstance();
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void startGame() {
        setup();

        while (this.running) {

        }
    }

    private void setup() {

        /*
         * setup players + accounts via playerController()
         * setup Die via DieController()
         * setup
         * setup Language via languageController()
         */
        this.uiController.promptForLanguage();
        
        for (Player player : this.playerController.getPlayers()) {
            player.setName(this.uiController.promptForPlayerName(player));
        }

    }
}
