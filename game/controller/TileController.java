package controller;

public class TileController {

    private static TileController instance;

    private TileController() {

    }

    public static TileController getInstance() {
        if (instance == null) {
            instance = new TileController();
        }
        return instance;
    }

    public Tile getTile(int faceValueSum) {
        // Dette er tiltænkt til UI-delen.
        for (Tile tile : Tile.values()) {
            if (tile.getValue() == faceValueSum) {
                return tile;
            }
        }
        throw new IllegalArgumentException("faceValueSum did not correspond to any Tile");
    }

}