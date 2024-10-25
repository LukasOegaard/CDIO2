package game.model;

public class Player {
    
    private String name;
    private Account account;

    Player() {
        this.name = "unnamed-player";
        this.account = new Account();
    }

    public String getName() {
        return this.name;
    }

    public Account getAccount() {
        return this.account;
    }

}
