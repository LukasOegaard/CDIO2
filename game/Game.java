package game;

import game.model.Player;
import game.util.DuplicatePlayerNameException;
import game.util.IllegalPlayerNameException;
import game.configuration.Config;
import game.controller.DieController;
import game.controller.PlayerController;
import game.controller.Tile;
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
            gameLoop();
        }
    }

    private void gameLoop() {
        // current player rolls
        // handle balance and printing
        // show balance
        // handle winning case
        Player currentPlayer = this.playerController.getNextPlayer();
        this.uiController.printRoll(currentPlayer);
        this.dieController.rollBoth();
        int sum = this.dieController.getSum();
        Tile currentTile = this.tileController.getTile(sum);
        this.uiController.printTileText(currentTile, currentPlayer);
        // Utils.println(currentPlayer.getName() + " landed on " +
        // this.uiController.printTileText(currentTile, currentPlayer) + " " +
        // Integer.toString(sum));
        int scoreConsequence = currentTile.getConsequence();
        if (scoreConsequence > 0) {
            currentPlayer.getAccount().increaseBalance(scoreConsequence);
        } else {
            currentPlayer.getAccount().decreaseBalance(scoreConsequence);
        }
        this.uiController.printBalance(currentPlayer);

        if (currentPlayer.getAccount().getBalance() >= Config.WINNING_BALANCE) {
            this.uiController.printWin(currentPlayer);
            this.running = false;
        }

        if (currentTile.grantsExtraTurn()) {
            this.playerController.setNextPlayer(currentPlayer);
        }
    }

    private void setup() {
        this.uiController.promptForLanguage();

        for (Player player : this.playerController.getPlayers()) {
            try {
                this.playerController.setPlayerName(player, this.uiController.promptForPlayerName(player));
            } catch (Exception e) {
                if (e instanceof DuplicatePlayerNameException) {
                    this.uiController.printPlayerNameUniqueConstraintViolation(player);
                } else if (e instanceof IllegalPlayerNameException) {
                    this.uiController.printPlayerNameIllegalChar(player);
                }
                this.running = false;
            }
        }
    }
}
