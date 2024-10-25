package game.controller;

import game.model.Player;
import game.configuration.Config;

import java.util.NoSuchElementException;
import java.util.ArrayList;

// this is a bit over engineered but we got bored
// also we can use this system for the next cdio assignment
public class PlayerController {

    private static PlayerController instance;

    private ArrayList<Player> players;
    private int nextPlayerNumber;

    private PlayerController() {
        this.players = new ArrayList<>();
        this.setupPlayers(Config.NUMBER_OF_PLAYERS);
        this.nextPlayerNumber = 1;
    }

    public static PlayerController getInstance() {
        if (instance == null) {
            instance = new PlayerController();
        }
        return instance;
    }

    public Player getPlayer(int playerNumber) {
        for (int i = 0; i < this.players.size(); i++) {
            Player current = this.players.get(i);
            if (current.getPlayerNumber() == playerNumber) {
                return current;
            }
        }
        throw new NoSuchElementException("Found no player with playerNumber " + playerNumber);
    }

    public Player getNextPlayer() {
        Player nextPlayer = this.getPlayer(this.nextPlayerNumber);
        this.incrementPlayerNumber();
        return nextPlayer;
    }

    public void setNextPlayer(Player player) {
        this.nextPlayerNumber = player.getPlayerNumber();
    }

    private void incrementPlayerNumber() {
        this.nextPlayerNumber++;
        if (this.nextPlayerNumber > this.players.size()) {
            this.nextPlayerNumber = 1;
        }
    }

    private void setupPlayers(int numberOfPlayers) {
        for (int i = 1; i <= numberOfPlayers; i++) {
            this.players.add(new Player(i));
        }
    }

}
