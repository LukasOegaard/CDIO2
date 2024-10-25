package controller;

import game.controller.Tile;

public class TileController{

    private static TileController instance;

    private TileController() {

    }

    public static TileController getInstance() {
        if (instance == null) {
            instance = new TileController();
        }
        return instance;
    }

    public Tile getTile(int faceValueSum){
        // Dette er tiltænkt til UI-delen.
        switch (faceValueSum) {
            case Tile.TOWER.getValue() -> Tile.TOWER;
            case Tile.CRATER.getValue() -> Tile.CRATER;
            case Tile.PALACE_GATES.getValue() -> Tile.PALACE_GATES;
            case Tile.COLD_DESERT.getValue() -> Tile.COLD_DESERT;
            case Tile.WALLED_CITY.getValue() -> Tile.WALLED_CITY;
            case Tile.MONASTERY.getValue() -> Tile.MONASTERY;
            case Tile.BLACK_CAVE.getValue() -> Tile.BLACK_CAVE;
            case Tile.HUTS_IN_THE_MOUNTAIN.getValue() -> Tile.HUTS_IN_THE_MOUNTAIN;
            case Tile.THE_WEREWALL.getValue() -> Tile.THE_WEREWALL;
            case Tile.THE_PIT.getValue() -> Tile.THE_PIT;
            case Tile.GOLDMINE.getValue() -> Tile.GOLDMINE;
            default -> throw new IllegalArgumentException("Not valid value " + faceValueSum);
        }

    }

    public Tile getConsequence() {
        // TODO add konsekvense af feltet der landes på:
        /*   1. (Man kan ikke slå 1 med to terninger)
        *    2. Tower +250
        *    3. Crater -100
        *    4. Palace gates +100
        *    5. Cold Desert -20
        *    6. Walled city +180
        *    7. Monastery 0
        *    8. Black cave -70
        *    9. Huts in the mountain +60
        *    10. The Werewall (werewolf-wall) -80, men spilleren får en ekstra tur.
        *    11. The pit -50
        *    12. Goldmine +650
        */
        return null;


    }

}