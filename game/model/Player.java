package game.model;

import game.configuration.Config;

public class Player {

    private String name;
    private Account account;
    private int playerNumber;

    public Player(int playerNumber) {
        this.name = Config.DEFAULT_PLAYER_NAME;
        this.playerNumber = playerNumber;
        this.account = new Account();
    }

    public String getName() {
        return this.name;
    }

    public Account getAccount() {
        return this.account;
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

}
