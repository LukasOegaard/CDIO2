package game.controller;

import game.i18n.LanguageController;

public class UIController {

    private static UIController instance;

    private LanguageController languageController;

    private UIController() {
        this.languageController = LanguageController.getInstance();
    }

    public static UIController getInstance() {
        if (instance == null) {
            instance = new UIController();
        }
        return instance;
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

}
