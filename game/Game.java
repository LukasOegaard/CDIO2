package game;

public class Game {
    
    private static Game instance;
    private boolean running;

    public static void main(String[] args) {
        getInstance().startGame();
    }

    private Game() {
        this.running = true;
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void startGame() {
        while (this.running) {
            
        }
    }
}
