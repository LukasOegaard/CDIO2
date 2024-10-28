package game.controller;

public class InputController {

    private static InputController instance;

    private InputController() {

    }

    public static InputController getInstance() {
        if (instance == null) {
            instance = new InputController();
        }
        return instance;
    }

}
