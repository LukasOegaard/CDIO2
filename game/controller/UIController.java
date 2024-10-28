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

}
