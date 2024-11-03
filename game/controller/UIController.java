package game.controller;

import game.i18n.Language;
import game.i18n.LanguageController;
import game.i18n.Message;
import game.model.Player;
import game.view.Utils;

public class UIController {

    private static UIController instance;

    private LanguageController languageController;
    private InputController inputController;

    private UIController() {
        this.languageController = LanguageController.getInstance();
        this.inputController = InputController.getInstance();
    }

    public static UIController getInstance() {
        if (instance == null) {
            instance = new UIController();
        }
        return instance;
    }

    public String promptForPlayerName(Player player) {
        Utils.println(this.languageController.getMessage(Message.ENTER_PLAYER_NAME, player));
        return this.inputController.getNextInput();
    }

    public void promptForLanguage() {
        Utils.println(this.languageController.getMessage(Message.LANGUAGE_PROMPT, null));
        String language = this.inputController.getNextInput();
        switch (language.toLowerCase()) {
            case "english":
                this.languageController.setLanguage(Language.ENGLISH);
                break;
            case "stupid":
                this.languageController.setLanguage(Language.STUPID);
                break;
            default:
                Utils.println("Invalid language!");
                this.promptForLanguage();
        }
    }

    public void printRoll(Player nextPlayer) {
        Utils.println(this.languageController.getMessage(Message.PLAYER_PRESS_TO_ROLL, nextPlayer));
        this.inputController.getNextInput();
    }

    public void printBalance(Player player) {
        Utils.println(this.languageController.getMessage(Message.CURRENT_PLAYER_BALANCE, player));
    }

    public void printWin(Player player) {
        Utils.println(this.languageController.getMessage(Message.WIN, player));
    }

    public void printTileText(Tile tile, Player player) {
        
        Message tileMessage;
        switch (tile) {
            case TOWER:
                tileMessage = Message.TILE_TOWER;
                break;
            case CRATER:
                tileMessage = Message.TILE_CRATER;
                break;
            case PALACE_GATES:
                tileMessage = Message.TILE_PALACE_GATES;
                break;
            case COLD_DESERT:
                tileMessage = Message.TILE_COLD_DESERT;
                break;
            case WALLED_CITY:
                tileMessage = Message.TILE_WALLED_CITY;
                break;
            case MONASTERY:
                tileMessage = Message.TILE_MONASTARY;
                break;
            case BLACK_CAVE:
                tileMessage = Message.TILE_BLACK_CAVE;
                break;
            case HUTS_IN_THE_MOUNTAIN:
                tileMessage = Message.TILE_HUTS_IN_THE_MOUNTAIN;
                break;
            case THE_WEREWALL:
                tileMessage = Message.TILE_THE_WEREWALL;
                break;
            case THE_PIT:
                tileMessage = Message.TILE_THE_PIT;
                break;
            case GOLDMINE:
                tileMessage = Message.TILE_GOLDMINE;
                break;
            default:
                throw new IllegalArgumentException("Error no such Tile");

        }

        Utils.println(this.languageController.getMessage(tileMessage, player));
    }

    public void printPlayerNameUniqueConstraintViolation(Player player) {
        Utils.println(this.languageController.getMessage(Message.PLAYER_NAME_UNIQUE_CONSTRAINT_VIOLATION, player));
    }

    public void printPlayerNameIllegalChar(Player player) {
        Utils.println(this.languageController.getMessage(Message.PLAYER_NAME_ILLEGAl_CHAR, player));
    }



}
