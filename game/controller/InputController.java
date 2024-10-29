package controller;

import java.util.Scanner;

public class InputController {

    private static InputController instance;
    private Scanner scanner;

    private InputController() {
        scanner = new Scanner(System.in);
    }

    public static InputController getInstance() {
        if (instance == null) {
            instance = new InputController();
        }
        return instance;
    }

    public String getNextInput() {
        return scanner.nextLine();
    }

}
