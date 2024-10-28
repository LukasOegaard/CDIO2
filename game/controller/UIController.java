package game.controller;

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

    public String getPlayerName(Player player) {
        Utils.println(this.languageController.getMessage(Message.ENTER_PLAYER_NAME, player));
        return this.inputController.getNextInput();
    }

}
